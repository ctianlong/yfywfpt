package com.newtouch.yfy.common;

import java.io.StringReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

import com.newtouch.yfy.api.AppoResources;


public class YY02Map {
	
	   
	
	public static Map<String, Object>  parseStrToMap(String strXml) {

		Map<String, Object> map = new HashMap<String, Object>();
		
	       try {
	    	   StringReader sr = new StringReader(strXml);  
			   InputSource is = new InputSource(sr); 
			   
	           DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

	           DocumentBuilder builder = factory.newDocumentBuilder();

	           Document document = builder.parse(is);

	           Element root = document.getDocumentElement();

	           NodeList nodeList = root.getChildNodes();
				 
				//String attValues[]=new String[nodeList.getLength()];  //锟斤拷锟斤拷值
	           if (null != root) {


	                  Node child = nodeList.item(0);

	                if (child.getNodeType() == Node.ELEMENT_NODE) {
	                	 
	                	String hospital = child.getAttributes().getNamedItem("hospital").getNodeValue();
	                	String stdate = child.getAttributes().getNamedItem("stdate").getNodeValue();
	                	String endate = child.getAttributes().getNamedItem("endate").getNodeValue();
	                	String dept_code = child.getAttributes().getNamedItem("dept_code").getNodeValue();
	                	String expert_code = child.getAttributes().getNamedItem("expert_code").getNodeValue();
	                	String partcode = child.getAttributes().getNamedItem("partcode").getNodeValue();
	                	String patfrom = child.getAttributes().getNamedItem("patfrom").getNodeValue();
	                	String cancelled = child.getAttributes().getNamedItem("cancelled").getNodeValue();
	                	
	                	map.put("hospital", hospital);
	                	map.put("stdate", stdate);
	                	map.put("endate", endate);
	                	map.put("dept_code", dept_code);
	                	map.put("expert_code", expert_code);
	                	map.put("partcode", partcode);
	                	map.put("patfrom", patfrom);
	                	map.put("cancelled", cancelled);
	                }
	              }
	       } catch (Exception e) {
	    	   
	           e.printStackTrace();
	           return null;
	       }  
	       return map;
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
