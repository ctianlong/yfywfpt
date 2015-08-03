package com.newtouch.yfy.common;
import java.io.StringReader;
import java.util.Map;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.xml.sax.InputSource;



/** 
 * DOM方式操作XML 
 */
public class XmlStrUtil {
    /** 
     * String 转换为 Document 对象 
     *  
     * @param xml 字符串 
     * @return Document 对象 
     */  
    public static Document string2Doc(String xml) {  
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();  
        DocumentBuilder builder = null;  
        Document doc = null;  
        InputSource source = null;  
        StringReader reader = null;  
        try {  
            builder = factory.newDocumentBuilder();  
            reader = new StringReader(xml);  
            source = new InputSource(reader);//使用字符流创建新的输入源  
            doc = builder.parse(source);  
            return doc;  
        } catch (Exception e) {  
            return null;  
        } finally {  
            if(reader != null){  
                reader.close();  
            }  
        }  
    }  
  
    
   
    
    public static void main(String[] args) { 
    	StringBuilder strAll = new StringBuilder();
    	String inputxml="<root>  <head>    <parameter><hashKey>640bbc36-b81f-4afa-956e-43b7f04f6968</hashKey>      <AlipayID>oTqovuOnGvo9G7z2XxfQ4btMcQsU</AlipayID>      <BookID>1795632</BookID>      <OptypeReg>0</OptypeReg>      <Isbook>1</Isbook>      <AgreementID>6006219295</AgreementID>    </parameter>  </head>  <body /></root>";
    	String xmlM = "<?xml version='1.0' encoding='gbk'?><rows>";
    	 //strAll = zfbXml(inputxml,xmlM).toString();
    	System.out.println(strAll.toString());
    }  
    
    public  String  zfbXml(String inputxml,String xmlm){
       StringBuilder strAll = new StringBuilder();
    	String[]	str = inputxml.trim().split("</head>");
    	strAll.append(str[0]);
    	strAll.append("</head>");
    	strAll.append("<body>");
    	strAll.append(xmlm);
    	strAll.append("</DataTable></body></root>");
    	return strAll.toString();
    }
    /**
     * 封装调用yfy接口参数
     * @param map
     * @return
     */
    public  String  yfyXml(Map map){
        StringBuilder yfystr = new StringBuilder();
        yfystr.append("<root> <head><parameter><hashKey>1dcc108c-45e2-4bac-a05f-0a86e061be9f</hashKey><ApplyIDFrom>");
        yfystr.append(map.get("hashKey"));
        yfystr.append("</ApplyIDFrom><AlipayID>");
        yfystr.append(map.get("AlipayID"));
        yfystr.append("</AlipayID><AgreementID>");
        yfystr.append(map.get("AgreementID"));
        yfystr.append("</AgreementID><Optype>");
        yfystr.append(map.get("Optypeyfy"));
        yfystr.append("</Optype></parameter></head><body /></root>");
     	
     	return yfystr.toString();
     }
    
	}
	
