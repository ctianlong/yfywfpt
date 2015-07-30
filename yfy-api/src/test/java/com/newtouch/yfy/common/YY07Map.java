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

import com.newtouch.yfy.api.Dept;


public class YY07Map {
	
	 
	
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
	                	map.put("hospital", hospital);
	                }
	              }
	       } catch (Exception e) {
	    	   
	           e.printStackTrace();
	           return null;
	       }  
	       return map;
	    }
	
	public static String  parseListToStr(List<Dept>  list,String xml){
		
		StringBuilder str =new StringBuilder();
		XmlStrUtil xmu =new XmlStrUtil();
		 str.append("<result>");
		if(list!=null){
		 str.append("OK</result><DataTable><rows>");
		 if(list.size()>0 && !list.isEmpty()){
			for(Dept dept : list){
				str.append("<row  hospital='").append(dept.getHospitalcode());
				str.append("' hospitalname='").append(dept.getHospitalname());
				str.append("' dept_code='").append(dept.getDeptcode());
				str.append("' dept_name='").append(dept.getDeptname());
				str.append("' dept_describe='");
				str.append("' DocNum='").append(dept.getDesc()+"'/>");
			  }
			}else{
				 str.append("<row message='数据库获取信息错误'/>");
			}
		 
		 }else{
		  str.append("false</result><DataTable><rows>");
		 }
		str.append("</rows>");
		System.out.println(str.toString());
		return xmu.zfbXml(xml,str.toString());
	}
}
