package com.newtouch.yfy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.newtouch.yfy.api.AppoInfo;
import com.newtouch.yfy.api.AppoResources;
import com.newtouch.yfy.api.Dept;
import com.newtouch.yfy.dao.CheckAuthorityfyDao;
import com.newtouch.yfy.dao.ReadAppoInfoDBDao;
import com.newtouch.yfy.dao.ReadAppoResourceDBDao;
import com.newtouch.yfy.dao.ReadDBDao;
import com.newtouch.yfy.service.ReadDBService;

@Service
public class ReadDBServiceImpl implements ReadDBService{
    
	
	@Autowired
	ReadDBDao  readDBDaoImpl ;
	
	@Autowired
	ReadAppoInfoDBDao readAppoInfoDBDaoImpl;
	
	@Autowired
	ReadAppoResourceDBDao readAppoResourceDBDaoImpl;
	
	@Autowired
	CheckAuthorityfyDao  policyDaoImpl ;
	
	@Override
	public List<Dept> getDeptData() {
		
		return readDBDaoImpl.findAll();
	}

	@Override
	public List<AppoResources> getApporesources() {
		
		return readAppoResourceDBDaoImpl.findAll();
	}

	@Override
	public List<AppoInfo> getAppInfo() {
		
		return readAppoInfoDBDaoImpl.findAll();
	}

	@Override
	public void dowriteToMysqlYY02(AppoResources appors) {
		readAppoResourceDBDaoImpl.save(appors);
	}

	@Override
	public void dowriteToMysqlYY07(Dept dept) {
		readDBDaoImpl.save(dept);
	}
	
}
