package com.newtouch.yfy.dao.impl;

import org.springframework.stereotype.Repository;

import com.newtouch.lion.dao.impl.BaseDaoImpl;
import com.newtouch.yfy.api.ServiceLog;
import com.newtouch.yfy.dao.WriteLogDao;

@Repository("writeLogImpl")
public class WriteLogImpl extends BaseDaoImpl<ServiceLog, Integer> implements WriteLogDao{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4410513162281639097L;

	

}
