package com.newtouch.yfy.service;

import com.newtouch.lion.page.PageResult;
import com.newtouch.lion.query.QueryCriteria;
import com.newtouch.yfy.api.CustomPerformanceProject;

public interface CustomPerformanceProjectService {
	/**
	 * 添加新的自定义绩效项目
	 */
	public void doCreate(CustomPerformanceProject customPerformanceProject);

	/**
	 * 更新自定义绩效项目
	 */
	public CustomPerformanceProject doUpdate(CustomPerformanceProject customPerformanceProject);

	/**
	 * 检查项目代码是否已存在
	 */
	public boolean checkProjectCode(String projectCode);
	
	public boolean checkProjectCode(String projectCode, Long id);
	/**
	 * 检查项目名称是否已存在
	 */
	public boolean checkProjectName(String projectName);

	public boolean checkProjectName(String projectName, Long id);
	
	public PageResult<CustomPerformanceProject> doFindByCriteria(QueryCriteria criteria);

	public CustomPerformanceProject doFindById(Long id);

	public int doDeleteById(Long id);


}
