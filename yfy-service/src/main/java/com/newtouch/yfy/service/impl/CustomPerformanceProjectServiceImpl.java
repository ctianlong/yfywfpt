package com.newtouch.yfy.service.impl;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.newtouch.lion.page.PageResult;
import com.newtouch.lion.query.QueryCriteria;
import com.newtouch.lion.service.AbstractService;
import com.newtouch.yfy.api.CustomPerformanceProject;
import com.newtouch.yfy.dao.CustomPerformanceProjectDao;
import com.newtouch.yfy.service.CustomPerformanceProjectService;

@Service("customPerformanceProjectService")
public class CustomPerformanceProjectServiceImpl extends AbstractService implements CustomPerformanceProjectService {

	@Autowired
	private CustomPerformanceProjectDao customPerformanceProjectDao;

	@Override
	public void doCreate(CustomPerformanceProject customPerformanceProject) {
		customPerformanceProjectDao.save(customPerformanceProject);
	}

	@Override
	public CustomPerformanceProject doUpdate(CustomPerformanceProject customPerformanceProject) {
		customPerformanceProjectDao.update(customPerformanceProject);
		return null;
	}

	@Override
	public boolean checkProjectCode(String projectCode) {
		if (StringUtils.isEmpty(projectCode.trim())) {
			return true;
		}
		CustomPerformanceProject cpp = customPerformanceProjectDao.doFindByProjectCode(projectCode.trim());
		if (cpp != null && cpp.getProjectCode().equals(projectCode.trim())) {
			return true;
		}
		return false;
	}
	
	@Override
	public boolean checkProjectCode(String projectCode, Long id) {
		if (StringUtils.isEmpty(projectCode.trim())) {
			return true;
		}
		CustomPerformanceProject cpp = customPerformanceProjectDao.doFindByProjectCode(projectCode.trim());
		if(cpp != null && !cpp.getId().equals(id) && cpp.getProjectCode().equals(projectCode.trim())){
			return true;
		}
		return false;
	}

	@Override
	public boolean checkProjectName(String projectName) {
		if (StringUtils.isEmpty(projectName.trim())) {
			return true;
		}
		CustomPerformanceProject cpp = customPerformanceProjectDao.doFindByProjectCode(projectName.trim());
		if (cpp != null && cpp.getProjectCode().equals(projectName.trim())) {
			return true;
		}
		return false;
	}

	@Override
	public boolean checkProjectName(String projectName, Long id) {
		if (StringUtils.isEmpty(projectName.trim())) {
			return true;
		}
		CustomPerformanceProject cpp = customPerformanceProjectDao.doFindByProjectName(projectName.trim());
		if(cpp != null && !cpp.getId().equals(id) && cpp.getProjectName().equals(projectName.trim())){
			return true;
		}
		return false;
	}

	@Override
	public PageResult<CustomPerformanceProject> doFindByCriteria(QueryCriteria criteria) {
		return customPerformanceProjectDao.doFindByCriteria(criteria);
	}

	@Override
	public CustomPerformanceProject doFindById(Long id) {
		return customPerformanceProjectDao.findById(id);
	}

	@Override
	public int doDeleteById(Long id) {
		return customPerformanceProjectDao.doDeleteById(id);
	}

	

}
