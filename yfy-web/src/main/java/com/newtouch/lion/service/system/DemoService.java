/*
 * Copyright (c)  2013, Newtouch
 * All rights reserved. 
 *
 * $id: DemoService.java 9552 2013-3-22 上午9:14:14 WangLijun$
 */
package com.newtouch.lion.service.system;

import java.util.List;

import com.newtouch.lion.model.system.DemoModel;
import com.newtouch.lion.model.system.User;
import com.newtouch.lion.page.PageResult;
import com.newtouch.lion.query.QueryCriteria;

public interface DemoService {
	/***
	 */
	public List<DemoModel> doFindByParentId();

	public void doCreateDemoModel(DemoModel demoModel);
	
	public PageResult<DemoModel> doFindByCriteria(QueryCriteria criteria);
	
	public DemoModel doUpdate(DemoModel demoModel);
	
	public Boolean checkNameZh(String nameZh);
	
	public Boolean checkNameZh(String nameZh, Long id);
	
	public DemoModel doFindByNameZh(String nameZh);
	
	public DemoModel doFindById(Long id);
	
	public int doDeleteById(Long id);
	
}
