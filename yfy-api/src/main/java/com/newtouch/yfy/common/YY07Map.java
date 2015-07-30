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

import com.newtouch.yfy.api.Dept;


public class YY07Map {
	
	 
	
	public List<Dept> parseStrToList(String strXml) {
			/**日志*/
			final Logger logger=LoggerFactory.getLogger(super.getClass());
			List<Dept> list = new ArrayList<Dept>();
		       try {
		    	   StringReader sr = new StringReader(strXml);  
				   InputSource is = new InputSource(sr); 
				   
		           DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

		           DocumentBuilder builder = factory.newDocumentBuilder();

		           Document document = builder.parse(is);

		           Element root = document.getDocumentElement();

		           NodeList nodeList = root.getChildNodes();
					 
		           logger.info(root.getNodeName());
		           if (null != root) {

		              for (int j = 0; j < nodeList.getLength(); j++) {

		            	  Dept dept =new Dept();
		                  Node child = nodeList.item(j);

		                  // 
		                  StringBuilder attValues = new StringBuilder();
		                if (child.getNodeType() == Node.ELEMENT_NODE) {
		                	String  hospital = child.getAttributes().getNamedItem("hospital").getNodeValue();
		                	dept.setHospitalcode(hospital);
		                	if("0".equals(hospital)){
		                		dept.setHospitalname("东院");
		                	}else if("2".equals(hospital)){
		                		dept.setHospitalname("西院");
		                	}else{
		                		dept.setHospitalname("南院");
		                	}
		                	dept.setDeptcode(child.getAttributes().getNamedItem("dept_code").getNodeValue());
		                	dept.setDeptname(child.getAttributes().getNamedItem("dept_name").getNodeValue());
		                	dept.setDesc(child.getAttributes().getNamedItem("DocNum").getNodeValue());
		                	list.add(dept);
		                } 
		              }
		           }
		       } catch (Exception e) {
		           e.printStackTrace();
		       }  
		       return list;
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
