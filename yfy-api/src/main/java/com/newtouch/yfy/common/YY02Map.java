package com.newtouch.yfy.common;

import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

import com.newtouch.yfy.api.AppoResources;


public class YY02Map {
	
	   
	
	public List<AppoResources>  parseStrToList(String strXml) {
			/**日志*/
			final Logger logger=LoggerFactory.getLogger(super.getClass());

			List<AppoResources> list = new ArrayList<AppoResources>();
		      
			try {
		    	   StringReader sr = new StringReader(strXml);  
				   InputSource is = new InputSource(sr); 
				   
		           DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

		           DocumentBuilder builder = factory.newDocumentBuilder();

		           Document document = builder.parse(is);

		           Element root = document.getDocumentElement();

		           NodeList nodeList = root.getChildNodes();
					 
					//String attValues[]=new String[nodeList.getLength()];  //锟斤拷锟斤拷值
		           logger.info(root.getNodeName());
		           if (null != root) {

		              for (int j = 0; j < nodeList.getLength(); j++) {

		                  Node child = nodeList.item(j);
		                  
		                  AppoResources appoResources = new AppoResources();

		                  StringBuilder attValues = new StringBuilder();
		                if (child.getNodeType() == Node.ELEMENT_NODE) {
		                	 
		                	appoResources.setHospitalcode(child.getAttributes().getNamedItem("hospital").getNodeValue());
		                	appoResources.setHospitalname(child.getAttributes().getNamedItem("hospitalname").getNodeValue());
		                	appoResources.setAppotemplateid(child.getAttributes().getNamedItem("templateid").getNodeValue());
		                	appoResources.setAppocode(child.getAttributes().getNamedItem("comcode").getNodeValue());
		                	appoResources.setDept1code(child.getAttributes().getNamedItem("deptl1code").getNodeValue());
		                	appoResources.setDept1name(child.getAttributes().getNamedItem("deptl1name").getNodeValue());
		                	appoResources.setDept2code(child.getAttributes().getNamedItem("deptl2code").getNodeValue());
		                	appoResources.setDept2name(child.getAttributes().getNamedItem("deptl2name").getNodeValue());
		                	appoResources.setDoctid("");
		                	if(null==child.getAttributes().getNamedItem("doctorid")){
		                		appoResources.setDoctcode("");
		                	}else{
		                		String doctorid = child.getAttributes().getNamedItem("doctorid").getNodeValue();
		                		appoResources.setDoctcode(doctorid);
		                	}
		                	appoResources.setDoctname(child.getAttributes().getNamedItem("doctorname").getNodeValue());
		                	appoResources.setExpertdegree(child.getAttributes().getNamedItem("Expert_degree").getNodeValue());
		                	String cancelled = child.getAttributes().getNamedItem("cancelled").getNodeValue();
							if("FALSE".equals(cancelled)){
								appoResources.setCancelled("0");
							}else{
								appoResources.setCancelled("1");
							} 
		                	String canceltime = child.getAttributes().getNamedItem("canceltime").getNodeValue();
		                	if("".equals(canceltime)){
		                		
							}else{
								appoResources.setCanceltime(canceltime);
							}
		                	appoResources.setRegistertype(child.getAttributes().getNamedItem("registertype").getNodeValue());
		                	appoResources.setAppodate(child.getAttributes().getNamedItem("date").getNodeValue());
		                	String timestart = child.getAttributes().getNamedItem("timestart").getNodeValue();
		                	appoResources.setAppostarttime(timestart);
		                	String timeend = child.getAttributes().getNamedItem("timeend").getNodeValue();
		                	appoResources.setAppoendtime(timeend);
		                	//预约时间段 AppoPeriod
		                	appoResources.setAppoperiod(timestart+"-"+timeend);
		                	appoResources.setResnumber(child.getAttributes().getNamedItem("resourcenumber").getNodeValue());
		                	appoResources.setSurplusnum(child.getAttributes().getNamedItem("num").getNodeValue());
		                	String registerFee = child.getAttributes().getNamedItem("registerfee").getNodeValue();
							if("".equals(registerFee)){
							}else{
								appoResources.setRegisterfee(registerFee);
							}
		                	 logger.info(attValues.toString());
		                	 list.add(appoResources);
		                }
		              }
		           }
		       } catch (Exception e) {
		    	   
		           e.printStackTrace();
		       }  
			return list;
		    }

public static String  parseListToStr(List<AppoResources>  list ,String xml){
		
		StringBuilder str =new StringBuilder();
        XmlStrUtil xmu =new XmlStrUtil();
        str.append("<result>");
		if(list!=null){
			str.append("OK</result>");
			str.append("<days><day date='2015-07-28'");
			int num =0;
			if(list.size()>0 && !list.isEmpty()){
				for(AppoResources appoResources : list){
					num += Integer.parseInt(appoResources.getSurplusnum());
				}
			 str.append("num='"+num +"'></days><DataTable><rows>");
			for(AppoResources appoResources : list){
				str.append("<row  hospital='").append(appoResources.getHospitalcode());
				str.append("' hospitalname='").append(appoResources.getHospitalname());
				str.append("' templateid='").append(appoResources.getAppotemplateid());
				str.append("' comcode='").append(appoResources.getAppocode());
				str.append("' deptl1code='").append(appoResources.getDept1code());
				str.append("' deptl1name='").append(appoResources.getDept1name());
				str.append("' deptl2code='").append(appoResources.getDept2code());
				str.append("' deptl2name='").append(appoResources.getDept2name());
				str.append("' registertype='").append(appoResources.getRegistertype());
				str.append("' doctorid='").append(appoResources.getDoctid());
				str.append("' doctorname='").append(appoResources.getDoctname());
				str.append("' diseasetype='");
				str.append("' resourcenumber='").append(appoResources.getResnumber());
				str.append("' date='").append(appoResources.getAppodate());
				str.append("' timestart='").append(appoResources.getAppostarttime());
				str.append("' timeend='").append(appoResources.getAppoendtime());
				str.append("' cancelled='").append(appoResources.getCancelled());
				str.append("' canceltime='").append(appoResources.getCanceltime());
				str.append("' registerfee='").append(appoResources.getRegisterfee());
				str.append("' out_period='");
				str.append("' partcode='");
				str.append("' num=''/>");
			  }
			
			}else{
				 str.append("num='"+num +"'></days><DataTable><rows><row message='数据库获取信息错误' />");
			}
		}else{
			str.append("false</result></days><DataTable><rows><row message='数据库获取信息错误' />");
		 }
		str.append("</rows>");
		System.out.println(str.toString());
		return xmu.zfbXml(xml,str.toString());
	}
}
