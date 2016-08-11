package com.newtouch.lion.service.system.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.newtouch.lion.common.sql.HqlUtils;
import com.newtouch.lion.dao.system.DemoDao;
import com.newtouch.lion.model.system.DemoModel;
import com.newtouch.lion.page.PageResult;
import com.newtouch.lion.query.QueryCriteria;
import com.newtouch.lion.service.AbstractService;
import com.newtouch.lion.service.system.DemoService;

@Service("demoService")
public class DemoServiceImpl extends AbstractService implements DemoService {

	@Autowired
	private DemoDao demoDao;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.lion.framework.service.system.DemoService#doFindByParentId()
	 */
	@Override
	public List<DemoModel> doFindByParentId() {
		String hql = "from DemoModel where  id=:id";
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("id", 4L);
		List<DemoModel> demoModels = demoDao.query(hql, params);
		return demoModels;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.lion.framework.service.system.DemoService#doCreateDemoModel(com
	 * .lion.framework.model.system.DemoModel)
	 */
	@Override
	public void doCreateDemoModel(DemoModel demoModel) {
		this.demoDao.save(demoModel);
	}

	@Override
	public PageResult<DemoModel> doFindByCriteria(QueryCriteria criteria) {
		String queryEntry = " from DemoModel ";

		String[] whereBodies = { "nameZh like :nameZh" };

		String fromJoinSubClause = "";

		Map<String, Object> params = criteria.getQueryCondition();

		String orderField = criteria.getOrderField();

		String orderDirection = criteria.getOrderDirection();

		String hql = HqlUtils.generateHql(queryEntry, fromJoinSubClause, whereBodies, orderField, orderDirection,
				params);

		int pageSize = criteria.getPageSize();

		int startIndex = criteria.getStartIndex();
		PageResult<DemoModel> pageResult = this.demoDao.query(hql, HqlUtils.generateCountHql(hql, null), params,
				startIndex, pageSize);
		return pageResult;
	}

	@Override
	public DemoModel doUpdate(DemoModel demoModel) {
		this.demoDao.update(demoModel);
		return demoModel;
	}

	@Override
	public Boolean checkNameZh(String nameZh) {
		boolean flag = false;
		if (StringUtils.isEmpty(nameZh)) {
			return true;
		}
		DemoModel demoModel = this.doFindByNameZh(nameZh.trim());
		if (demoModel != null && demoModel.getNameZh().equals(nameZh.trim())) {
			flag = true;
		}
		return flag;
	}

	@Override
	public Boolean checkNameZh(String nameZh, Long id) {
		boolean flag = false;
		if (StringUtils.isEmpty(nameZh)) {
			return true;
		}
		DemoModel demoModel = this.doFindByNameZh(nameZh.trim());
		if (demoModel != null && !demoModel.getId().equals(id) && demoModel.getNameZh().equals(nameZh.trim())) {
			flag = true;
		}
		return flag;
	}

	@Override
	public DemoModel doFindByNameZh(String nameZh) {
		String hql = "from DemoModel d where d.nameZh = :nameZh";
		Map<String, Object> params = new HashMap<>();
		params.put("nameZh", nameZh);
		List<DemoModel> demoModels = this.demoDao.query(hql, params);
		if (!CollectionUtils.isEmpty(demoModels)) {
			return demoModels.get(0);
		}
		return null;
	}

	@Override
	public DemoModel doFindById(Long id) {
		return this.demoDao.findById(id);
	}

	@Override
	public int doDeleteById(Long id) {
		String hql = "delete from DemoModel d where d.id = :id";
		Map<String, Object> params = new HashMap<>();
		params.put("id", id);
		return this.demoDao.updateHQL(hql, params);
	}

}
