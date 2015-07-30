package com.newtouch.yfy.service;

import java.util.List;

import com.newtouch.yfy.api.AppoInfo;
import com.newtouch.yfy.api.AppoResources;
import com.newtouch.yfy.api.Dept;


/**
 * 查询数据库 数据
 * @author Administrator
 *
 */
public interface ReadDBService {
	
	/**
	 *  获取部门表数据
	 */
	public List<Dept> getDeptData();
	/**
	 * 获取科室数据
	 */
	public List<AppoResources> getApporesources();
	/**
	 * 预约资源表数据
	 */
	public List<AppoInfo>  getAppInfo();
	
	/**
	 * 保存预约资源表数据
	 * @return 
	 */
	public void dowriteToMysqlYY02 (AppoResources appors);
	
	/**
	 *  保存部门表数据
	 */
	public void dowriteToMysqlYY07(Dept dept);
	
}
