package com.newtouch.yfy.service;

import com.newtouch.yfy.api.Authorityfy;


/**
 * 校验接口调用权限
 * @author Administrator
 *
 */
public interface CheckAuthorityfyService {

	/**
	 * 校验Hashkey
	 * @param authorityfy
	 * @return
	 * @throws Throwable 
	 */
	public Boolean findHashKey(Authorityfy authorityfy) throws Throwable;
	/**
	 * 校验AlipayId AgreementId
	 * @param authorityfy
	 * @return
	 */
	public Boolean findAlipayAgreement(Authorityfy authorityfy);
}
