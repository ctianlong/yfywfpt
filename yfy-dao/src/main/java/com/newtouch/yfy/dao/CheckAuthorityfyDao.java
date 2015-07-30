package com.newtouch.yfy.dao;

import com.newtouch.yfy.api.Authorityfy;



/**
 * 查询数据所有数据
 * @author Administrator
 *
 */
public interface CheckAuthorityfyDao {
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
