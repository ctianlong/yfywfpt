package com.newtouch.yfy.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.newtouch.yfy.api.Authorityfy;
import com.newtouch.yfy.dao.CheckAuthorityfyDao;
import com.newtouch.yfy.service.CheckAuthorityfyService;
@Service
public class CheckAuthorityfyServiceImpl implements CheckAuthorityfyService {

	@Autowired
	CheckAuthorityfyDao  checkAuthorityfyDaoImpl ;
	
	@Override
	public Boolean findHashKey(Authorityfy authorityfy) throws Throwable {
		return checkAuthorityfyDaoImpl.findHashKey(authorityfy);
	}

	@Override
	public Boolean findAlipayAgreement(Authorityfy authorityfy) {
		// TODO Auto-generated method stub
		return null;
	}

}
