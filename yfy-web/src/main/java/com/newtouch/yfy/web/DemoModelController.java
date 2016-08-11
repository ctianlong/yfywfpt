package com.newtouch.yfy.web;

import java.util.HashMap;
import java.util.Map;

import javax.validation.Valid;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.newtouch.lion.common.file.FileUtil;
import com.newtouch.lion.data.DataTable;
import com.newtouch.lion.model.datagrid.DataGrid;
import com.newtouch.lion.model.system.DemoModel;
import com.newtouch.lion.page.PageResult;
import com.newtouch.lion.query.QueryCriteria;
import com.newtouch.lion.service.datagrid.DataGridService;
import com.newtouch.lion.service.excel.ExcelExportService;
import com.newtouch.lion.service.system.DemoService;
import com.newtouch.lion.web.constant.ConstantMessage;
import com.newtouch.lion.web.controller.AbstractController;
import com.newtouch.lion.web.model.QueryDt;
import com.newtouch.lion.web.model.QueryVo;
import com.newtouch.lion.web.servlet.view.support.BindMessage;
import com.newtouch.lion.web.servlet.view.support.BindResult;
import com.newtouch.yfy.api.CustomPerformanceProject;
import com.newtouch.yfy.service.CustomPerformanceProjectService;
import com.newtouch.yfy.web.model.CustomPerformanceProjectVo;
import com.newtouch.yfy.web.model.DemoModelVo;

@Controller
@RequestMapping("/demo/**")
public class DemoModelController extends AbstractController {

	private final Logger logger = LoggerFactory.getLogger(super.getClass());
	/** 默认排序字段 */
	private static final String DEFAULT_ORDER_FILED_NAME = "id";
	/** 首页 */
	private static final String INDEX_RETURN = "/yfy/demo/index";
	@Autowired
	private DemoService demoService;
	/** DataGrid表格 */
	@Autowired
	private DataGridService dataGridService;
	/** Excel通用导出 */
	@Autowired
	private ExcelExportService excelExportService;

	/** 首页显示 */
	@RequestMapping(value = "index", method = RequestMethod.GET)
	public String Index() {
		return INDEX_RETURN;
	}

	/** 列表显示 */
	@RequestMapping(value = "list")
	@ResponseBody
	public DataTable<DemoModel> lists(@ModelAttribute("queryDt") QueryDt queryDt,
			@ModelAttribute("demo") DemoModelVo demoModelVo) {
		QueryCriteria queryCriteria = new QueryCriteria();
		// 设置分页 启始页
		queryCriteria.setStartIndex(queryDt.getPage());
		// 每页大小
		queryCriteria.setPageSize(queryDt.getRows());
		// 设置排序字段及排序方向
		if (StringUtils.isNotEmpty(queryDt.getSort()) && StringUtils.isNotEmpty(queryDt.getOrder())) {
			queryCriteria.setOrderField(queryDt.getSort());
			queryCriteria.setOrderDirection(queryDt.getOrder());
		} else {
			queryCriteria.setOrderField(DEFAULT_ORDER_FILED_NAME);
			queryCriteria.setOrderDirection(QueryCriteria.ASC);
		}

		if (StringUtils.isNotEmpty(demoModelVo.getNameZh())) {
			queryCriteria.addQueryCondition("nameZh", "%" + demoModelVo.getNameZh().trim() + "%");
		}

		PageResult<DemoModel> pageResult = this.demoService.doFindByCriteria(queryCriteria);

		return pageResult.getDataTable(queryDt.getRequestId());
	}

	/** 添加提交 */
	@RequestMapping(value = "add")
	@ResponseBody
	public ModelAndView add(@Valid @ModelAttribute("demo") DemoModelVo demoModelVo, Errors errors,
			ModelAndView modelAndView) {
		// 检查基于Model的验证框架
		if (errors.hasErrors()) {
			modelAndView.addObject(BindMessage.ERRORS_MODEL_KEY, errors);
			return this.getJsonView(modelAndView);
		}
		if (demoService.checkNameZh(demoModelVo.getNameZh())) {
			errors.rejectValue("nameZh", "sys.demomodel.namezh.existed.message",
					new Object[] { demoModelVo.getNameZh() }, null);
		}

		// 再次检查是否出错
		if (errors.hasErrors()) {
			modelAndView.addObject(BindMessage.ERRORS_MODEL_KEY, errors);
			return this.getJsonView(modelAndView);
		}
		DemoModel demoModel = new DemoModel();
		BeanUtils.copyProperties(demoModelVo, demoModel);
		// 去空格
		demoModel.setNameZh(demoModelVo.getNameZh().trim());

		demoService.doCreateDemoModel(demoModel);

		Map<String, String> params = new HashMap<String, String>();
		params.put(BindResult.SUCCESS, ConstantMessage.ADD_SUCCESS_MESSAGE_CODE);
		modelAndView.addObject(BindMessage.SUCCESS, params);
		return this.getJsonView(modelAndView);
	}

	/** 编辑提交 */
	@RequestMapping(value = "edit")
	@ResponseBody
	public ModelAndView edit(@Valid @ModelAttribute("demo") DemoModelVo demoModelVo, Errors errors,
			ModelAndView modelAndView) {

		DemoModel demoModel = null;
		if (demoModelVo.getId() != null) {
			demoModel = this.demoService.doFindById(demoModelVo.getId());
			if (demoModel == null) {
				errors.reject(ConstantMessage.EDIT_ISEMPTY_FAIL_MESSAGE_CODE);
			}
		} else {
			errors.reject(ConstantMessage.EDIT_ISEMPTY_FAIL_MESSAGE_CODE);
		}

		if (errors.hasErrors()) {
			modelAndView.addObject(BindMessage.ERRORS_MODEL_KEY, errors);
			return this.getJsonView(modelAndView);
		}
		// 检查用户是否已存在
		if (demoService.checkNameZh(demoModelVo.getNameZh(), demoModelVo.getId())) {
			errors.rejectValue("nameZh", "sys.demomodel.nameZh.existed.message",
					new Object[] { demoModelVo.getNameZh() }, null);
		}

		// 再次检查是否出错
		if (errors.hasErrors()) {
			modelAndView.addObject(BindMessage.ERRORS_MODEL_KEY, errors);
			return this.getJsonView(modelAndView);
		}

		BeanUtils.copyProperties(demoModelVo, demoModel);
		// 去空格
		demoModel.setNameZh(demoModelVo.getNameZh().trim());

		this.demoService.doUpdate(demoModel);
		Map<String, String> params = new HashMap<String, String>();
		params.put(BindResult.SUCCESS, ConstantMessage.EDIT_SUCCESS_MESSAGE_CODE);
		modelAndView.addObject(BindMessage.SUCCESS, params);
		return this.getJsonView(modelAndView);
	}

	/** 删除 */
	@RequestMapping(value = "delete")
	@ResponseBody
	public ModelAndView delete(@RequestParam Long id, ModelAndView modelAndView) {
		Map<String, String> params = new HashMap<String, String>();

		int updateRow = this.demoService.doDeleteById(id);
		if (updateRow > 0) {
			params.put(BindResult.SUCCESS, ConstantMessage.DELETE_SUCCESS_MESSAGE_CODE);
		} else {
			params.put(BindResult.SUCCESS, ConstantMessage.DELETE_FAIL_MESSAGE_CODE);
		}
		modelAndView.addObject(BindMessage.SUCCESS, params);
		return this.getJsonView(modelAndView);
	}

	/** excel导出 **/
	@RequestMapping(value = "export")
	@ResponseBody
	public ModelAndView exportExcel(@ModelAttribute("queryVo") QueryVo queryVo,
			@ModelAttribute("demo") DemoModelVo demoModelVo, Errors errors, ModelAndView modelAndView) {

		DataGrid dataGrid = dataGridService.doFindByTableIdAndSort(queryVo.getTableId());
		QueryCriteria queryCriteria = new QueryCriteria();
		queryCriteria.setPageSize(10000);

		// 设置分页 启始页
		// queryCriteria.setStartIndex(queryVo.getRows() * (queryVo.getPage() -
		// 1));
		queryCriteria.setStartIndex(queryVo.getPage());
		// 每页大小
		queryCriteria.setPageSize(queryVo.getRows());
		// 设置排序字段及排序方向
		if (StringUtils.isNotEmpty(queryVo.getSort()) && StringUtils.isNotEmpty(queryVo.getOrder())) {
			queryCriteria.setOrderField(queryVo.getSort());
			queryCriteria.setOrderDirection(queryVo.getOrder());
		} else {
			queryCriteria.setOrderField(DEFAULT_ORDER_FILED_NAME);
			queryCriteria.setOrderDirection(QueryCriteria.ASC);
		}

		if (StringUtils.isNotEmpty(demoModelVo.getNameZh())) {
			queryCriteria.addQueryCondition("nameZh", "%" + demoModelVo.getNameZh().trim() + "%");
		}

		PageResult<DemoModel> result = this.demoService.doFindByCriteria(queryCriteria);
		Map<String, Map<Object, Object>> fieldCodeTypes = new HashMap<String, Map<Object, Object>>();

		Map<String, String> dataFormats = new HashMap<String, String>();
		// dataFormats.put("date", DateUtil.FORMAT_DATE_YYYY_MM_DD);
		// 创建.xls的文件名
		String fileName = this.createFileName(FileUtil.EXCEL_EXTENSION);

		modelAndView.addObject("title", dataGrid.getTitle());

		Long startTime = System.currentTimeMillis();

		fileName = excelExportService.export(dataGrid, result.getContent(), fileName, fieldCodeTypes, dataFormats);

		logger.info("fileName:{}", fileName);

		Long costTime = System.currentTimeMillis() - startTime;

		modelAndView.addObject(FILENAME, fileName);

		logger.info("export Excel {} cost:{} time,fileName:{}", dataGrid.getTitle(), costTime, fileName);
		logger.info("out Excel导出");
		return this.getExcelView(modelAndView);
	}
	
	/***
	 * 检查中文名是否已存在
	 * 
	 * @return 存在返回false,不存在则返回true
	 */
	@RequestMapping(value = "checknamezh")
	@ResponseBody
	public Boolean checkNameZh(@RequestParam(required = false) String nameZh,
			@RequestParam(required = false) Long id) {
		return demoService.checkNameZh(nameZh, id) ? false : true;
	}

}
