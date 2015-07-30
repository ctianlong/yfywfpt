package com.newtouch.yfy.dao.impl;

import org.springframework.stereotype.Repository;

import com.newtouch.lion.dao.impl.BaseDaoImpl;
import com.newtouch.yfy.api.Dept;
import com.newtouch.yfy.dao.ReadDBDao;

@Repository("readDBDaoImpl")
public class ReadDBDaoImpl extends BaseDaoImpl<Dept, Long> implements ReadDBDao{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5043175307441153543L;
	
}
