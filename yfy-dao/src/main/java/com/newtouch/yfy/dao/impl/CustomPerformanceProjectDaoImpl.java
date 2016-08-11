package com.newtouch.yfy.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;
import org.springframework.util.CollectionUtils;

import com.newtouch.lion.common.sql.HqlUtils;
import com.newtouch.lion.dao.impl.BaseDaoImpl;
import com.newtouch.lion.page.PageResult;
import com.newtouch.lion.query.QueryCriteria;
import com.newtouch.yfy.dao.CustomPerformanceProjectDao;
import com.newtouch.yfy.api.CustomPerformanceProject;

@Repository("customPerformanceProjectDao")
public class CustomPerformanceProjectDaoImpl extends BaseDaoImpl<CustomPerformanceProject, Long>
		implements CustomPerformanceProjectDao {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2265544155798198988L;

	@Override
	public CustomPerformanceProject doFindByProjectCode(String projectCode) {
		String hql = "from CustomPerformanceProject p where p.projectCode=:projectCode";
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("projectCode", projectCode);
		List<CustomPerformanceProject> list = this.query(hql, params);
		if (!CollectionUtils.isEmpty(list)) {
			return list.get(0);
		}
		return null;
	}

	@Override
	public CustomPerformanceProject doFindByProjectName(String projectName) {
		String hql = "from CustomPerformanceProject p where p.projectName=:projectName";
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("projectName", projectName);
		List<CustomPerformanceProject> list = this.query(hql, params);
		if (!CollectionUtils.isEmpty(list)) {
			return list.get(0);
		}
		return null;
	}

	@Override
	public int doDeleteById(Long id) {
		String hql = "delete from CustomPerformanceProject p where p.id=:id";
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("id", id);
		return this.updateHQL(hql, params);
	}

	@Override
	public PageResult<CustomPerformanceProject> doFindByCriteria(QueryCriteria criteria) {
		String queryEntry = " from CustomPerformanceProject ";
		String[] whereBodies = { "projectCode like :projectCode", "projectName like :projectName" };
		String fromJoinSubClause = "";
		Map<String, Object> params = criteria.getQueryCondition();
		String orderField = criteria.getOrderField();
		String orderDirection = criteria.getOrderDirection();
		String hql = HqlUtils.generateHql(queryEntry, fromJoinSubClause, whereBodies, orderField, orderDirection,
				params);
		int pageSize = criteria.getPageSize();
		int startIndex = criteria.getStartIndex();
		PageResult<CustomPerformanceProject> pageResult = this.query(hql, HqlUtils.generateCountHql(hql, null), params,
				startIndex, pageSize);
		return pageResult;
	}

}
