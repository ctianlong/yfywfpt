package com.newtouch.yfy.dao;

import com.newtouch.lion.dao.BaseDao;
import com.newtouch.lion.page.PageResult;
import com.newtouch.lion.query.QueryCriteria;
import com.newtouch.yfy.api.CustomPerformanceProject;

public interface CustomPerformanceProjectDao extends BaseDao<CustomPerformanceProject, Long> {

	public CustomPerformanceProject doFindByProjectCode(String projectCode);

	public CustomPerformanceProject doFindByProjectName(String projectName);

	public int doDeleteById(Long id);

	public PageResult<CustomPerformanceProject> doFindByCriteria(QueryCriteria criteria);

}
