package com.newtouch.lion.service.system;

import java.util.List;
import java.util.Map;

import com.newtouch.lion.model.system.Department;

public interface DepartmentService {

	/***
	 * 保存部门对象
	 * 
	 * @param department
	 *            部门对象
	 */
	public void doCreateDepartment(Department department);

	/**
	 * 保存部门对象
	 * 
	 * @param department
	 *            部门对象
	 * @param parentDeptId
	 *            部门父子对象
	 * */
	public void idoSaveDepartment(Department department, Long parentDeptId);

	/***
	 * 根据部门ID查询部门,并返回部门信息
	 * 
	 * @param id
	 *            部门Id
	 */
	public Department doFindDepartmentById(Long id);

	/***
	 * 根据部门ID查询部门,并返回部门信息
	 * 
	 * @param id
	 *            部门Id
	 */
	public Department doGetById(Long id);

	/***/
	public void doDelete(Department department);

	/***/
	public int doDeleteById(Long id);

	/** 根据ID删除 */
	public Department doDelete(Long id);

	/***
	 * 更新部门信息，
	 */
	public Department doUpdate(Department department);

	/**
	 * 查询第一层级部门信息，查询条件为:parentDepartmentId="" or =null
	 * */
	public List<Department> doFindFirstLevel();

	/** 生成树结构 */
	public Department makeTreeDepartment(Department department);

	/** 查找所有部门信息 */
	public List<Department> doFindAll();

	/***
	 */
	public  List<Department> makeTree(List<Department> elements,
			List<Department> structures);

	/**
	 * 生成JSON树结构
	 * 
	 * @return json
	 * */
	public String doFindFirstLevelToTree();
	


	/***
	 * 根据
	 * 
	 * @param tableId
	 *            表格名称
	 * @return String JOSN字符串
	 */
	public String doFindAll(String tableId);
	/***
	 * 查询所有部门列表，并转换为Map
	 * @return Map<Object,Object>
	 */
	public Map<Object,Object> doFindDapartmentAll();

}
