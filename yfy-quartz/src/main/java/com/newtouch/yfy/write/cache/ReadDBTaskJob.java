package com.newtouch.yfy.write.cache;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.danga.MemCached.MemCachedClient;
import com.newtouch.yfy.api.AppoResources;
import com.newtouch.yfy.api.Dept;
import com.newtouch.yfy.common.Common;
import com.newtouch.yfy.service.ReadDBService;
import com.yfy.memcach.util.MemcachedUtil;

/**
 * 读取数据库数据，并将数据写入缓存
 * @author Administrator
 *
 */
public class ReadDBTaskJob {
	protected final Logger logger = LoggerFactory.getLogger(super.getClass());
	
	@Autowired
	ReadDBService  readDBServiceImpl;
	MemCachedClient client = MemcachedUtil.getMemcachedClient();
	/**
	 * 执行任务 读取 部门表 和 预约 资源 表
	 */
	public void execute(){
		System.out.println("开始执行。。。。。");
		//获取 部门表数据
		List<Dept> deptDataList = readDBServiceImpl.getDeptData();
		//获取预约资源表数据
//		List<AppoInfo> appInfo = readDBServiceImpl.getAppInfo();
		Map<String,List<Dept>> mapDept = getDeptMap(deptDataList);
		//获取预约信息表
		List<AppoResources> apporesources = readDBServiceImpl.getApporesources();
		Map<String,List<AppoResources>> mapAppo= getAppoResourcesMap(apporesources);
		
		client.add(Common.DEPT_KEY, mapDept);
		System.out.println(Common.DEPT_KEY+":::写入成功"+mapDept);
		
		client.add(Common.APPORESOURCE_KEY, mapAppo);
		System.out.println(Common.APPORESOURCE_KEY+"::: 写入成功"+mapAppo);
		
		logger.info("缓存写入成功");
	}
	
	/**
	 * 对部门表数据进行分类
	 * @param list
	 */
	private Map<String,List<Dept>> getDeptMap(List<Dept> list){
		Map<String,List<Dept>> map = new HashMap<String,List<Dept>>();
		for (int i = 0; i <list.size(); i++) {
			Dept dept = list.get(i);
			if(map.containsKey(dept.getHospitalcode())){
				List<Dept> listDept = map.get(dept.getHospitalcode());
				listDept.add(dept);
				map.put(dept.getHospitalcode(), listDept);
			}else{
				List<Dept> ll = new ArrayList<Dept>();
				ll.add(dept);
				map.put(dept.getHospitalcode(), ll);
			}
		}
		return map;
	}
	/**
	 * 对预约资源表数据进行分类
	 * @param list
	 */
	private Map<String,List<AppoResources>> getAppoResourcesMap(List<AppoResources> list){
		Map<String,List<AppoResources>> map = new HashMap<String,List<AppoResources>>();
		for (int i = 0; i <list.size(); i++) {
			AppoResources appo = list.get(i);
			String key = appo.getHospitalcode()+"_"+appo.getDept2code();
			if(map.containsKey(key)){
				List<AppoResources> listAppo = map.get(key);
				listAppo.add(appo);
				map.put(appo.getHospitalcode(), listAppo);
			}else{
				List<AppoResources> ll = new ArrayList<AppoResources>();
				ll.add(appo);
				map.put(key, ll);
			}
		}
		return map;
	}
	
}
