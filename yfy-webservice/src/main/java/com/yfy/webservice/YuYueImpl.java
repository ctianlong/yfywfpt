package com.yfy.webservice;

import java.rmi.RemoteException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.jms.JMSException;
import javax.jws.WebService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.newtouch.yfy.api.*;
import com.newtouch.yfy.common.Common;
import com.newtouch.yfy.common.XmlStrUtil;
import com.newtouch.yfy.common.YY02Map;
import com.newtouch.yfy.common.YY07Map;
import com.newtouch.yfy.common.ZfbXmlAnalysis;
import com.yfy.memcach.util.MemcachedUtil;
import com.yfy.mq.IQueueSender;
import com.yfypt.webservice.alipay.AlipayServiceSoapProxy;


@WebService(endpointInterface = "com.yfy.webservice.YuYue")  
public class YuYueImpl implements YuYue {
	protected final Logger logger = LoggerFactory.getLogger(super.getClass());
	/**
	 * 队列消息发送者
	 */
	@Resource(name="QueueSender")
	IQueueSender   queueSender;
	@Override
	public String doYuYue(String xmlMessage) {
		try {
			queueSender.send(xmlMessage);
		} catch (JMSException e) {
			logger.info("队列消息发送失败:", e);
			e.printStackTrace();
			return "no";
		}
		return "yes";
	}
	/**
	 * 对外调用接口的实现
	 * @throws RemoteException 
	 */
	@Override
	public String alipayBooking(String xmlMessage) throws RemoteException {
		Map<String, Object> map = new HashMap<String, Object>();
		ZfbXmlAnalysis zfbxml = new ZfbXmlAnalysis();
		XmlStrUtil  xmlstrutil = new XmlStrUtil();
		AlipayServiceSoapProxy  alipayService = new AlipayServiceSoapProxy();
		map = zfbxml.zfbXml(xmlMessage);
		String callType = map.get("Optype").toString();
		map.put("Optypeyfy", "1");
		String yfyInxml= xmlstrutil.yfyXml(map);
		String yfyOutxml = alipayService.alipay_Authoration_ApplyAndUser(yfyInxml);
		map.clear();
		map = zfbxml.zfbXml(yfyOutxml);
		
		String flag = map.get("result").toString();
		String str="";
		if("OK".equals(flag)){
			if("02".equals(callType)){
				str = alipayBookingYY02( callType, xmlMessage);
			}else if("01".equals(callType)){
				str = alipayBookingYY07( callType, xmlMessage);
			}else{
				str ="<root><head><parameter><Optype></Optype><hashKey></hashKey><HospitalID></HospitalID><AlipayID></AlipayID> <AgreementID></AgreementID>  <TemplateID></TemplateID><CardNo></CardNo> </parameter>  </head><body><result>FALSE</result><DataTable> <rows><row issucess=\"\" message=\"传入参数Optype有误\" resourcenumber=\"\" reservationid=\"\" queuenumber=\"\"></row></rows></DataTable></body></root>";
			}
		}else{
			str ="<root><head><parameter><Optype></Optype><hashKey></hashKey><HospitalID></HospitalID><AlipayID></AlipayID> <AgreementID></AgreementID>  <TemplateID></TemplateID><CardNo></CardNo> </parameter>  </head><body><result>FALSE</result><DataTable> <rows><row issucess=\"\" message=\"用户未授权\" resourcenumber=\"\" reservationid=\"\" queuenumber=\"\"></row></rows></DataTable></body></root>";
		}
		System.out.println(str);
		return str;
	}

	/**
	 * 
	 * @param name 读取预约资源模板 yy02
	 * @return
	 * @throws SQLException 
	 */
	public  String alipayBookingYY02(String callType,String strXml)  {
		Map<String, Object> map = new HashMap<String, Object>();
		YY02Map yy02Map = new YY02Map();
		ZfbXmlAnalysis zfbxml = new ZfbXmlAnalysis();
		map = zfbxml.zfbXml(strXml);
		
		Map<String,List<AppoResources>> maplist = (Map<String, List<AppoResources>>) MemcachedUtil.getMemcachedClient().get(Common.APPORESOURCE_KEY) ;//从队列  读取预约资源模板;
		String string = map.get("HospitalID")+"_"+map.get("Dept_code");
		List<AppoResources> list = new ArrayList<AppoResources>();
				if(null!=maplist){
					list= 	(List<AppoResources>) maplist.get(string);
				}
		
		return yy02Map.parseListToStr(list,strXml);
	}
	
	/**
	 * 
	 * @param name获取 部门表数据  yy07
	 * @return
	 * @throws SQLException 
	 */
	public  String alipayBookingYY07(String callType,String strXml){
		Map<String, Object> map = new HashMap<String, Object>();
		ZfbXmlAnalysis zfbxml = new ZfbXmlAnalysis();
		YY07Map yy07Map = new YY07Map();
		map = zfbxml.zfbXml(strXml);
		Map<String,List<Dept>> maplist = (Map<String,List<Dept>>) MemcachedUtil.getMemcachedClient().get(Common.DEPT_KEY) ;
		List<Dept> list =  new ArrayList<Dept>();
		if(null!=maplist){
			list= 	(List<Dept>) maplist.get(map.get("HospitalID"));
		}
		return yy07Map.parseListToStr(list,strXml);
	}
	
	 
}
