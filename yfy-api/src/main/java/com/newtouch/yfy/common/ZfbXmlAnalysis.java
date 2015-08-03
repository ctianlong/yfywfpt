package com.newtouch.yfy.common;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.net.URI;
import java.util.HashMap;
import java.util.Map;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.omg.Dynamic.Parameter;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

 
 
/** 
 * DOM方式操作XML 
 */
public class ZfbXmlAnalysis {
    /** 
     * 将给定文件的内容或者给定 URI 的内容解析为一个 XML 文档，并且返回一个新的 DOM Document 对象 
     *  
     * @param filePath 文件所在路径 
     * @return DOM的Document对象 
     * @throws Exception 
     */  
    public static Document xml2Doc(String filePath) {  
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();  
        DocumentBuilder builder = null;  
        FileInputStream inputStream = null;  
        Document doc = null;  
        try {  
            builder = factory.newDocumentBuilder();  
  
            /* 通过文件方式读取,注意文件保存的编码和文件的声明编码要一致(默认文件声明是UTF-8) */  
            File file = new File(filePath);  
            doc = builder.parse(file);  
  
            /* 通过一个URL方式读取 */  
            URI uri = new URI(filePath);//filePath="http://java.sun.com/index.html"  
            doc = builder.parse(uri.toString());  
    
            /* 通过java IO 流的读取 */  
            inputStream = new FileInputStream(filePath);  
            doc = builder.parse(inputStream);  
            return doc;  
        } catch (Exception e) {  
            return null;  
        } finally {  
            if (inputStream != null) {  
                try {  
                    inputStream.close();  
                } catch (IOException e) {  
                    return null;  
                }  
            }  
        }  
    }  
    /** 
     * Document 转换为 String 
     *  
     * @param doc XML的Document对象 
     * @return String 
     */  
    public static String doc2String(Document doc){  
        try {  
            Source source = new DOMSource(doc);  
            StringWriter stringWriter = new StringWriter();  
            Result result = new StreamResult(stringWriter);  
            TransformerFactory factory = TransformerFactory.newInstance();  
            Transformer transformer = factory.newTransformer();  
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");  
            transformer.transform(source, result);  
            return stringWriter.getBuffer().toString();  
        } catch (Exception e) {  
            return null;  
        }  
    }  
  
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
  
    /** 
     * Document 保存为 XML 文件 
     *  
     * @param doc Document对象 
     * @param path 文件路径 
     */  
    public static void doc2XML(Document doc, String path) {  
        try {  
            Source source = new DOMSource(doc);  
            Result result = new StreamResult(new File(path));  
            Transformer transformer = TransformerFactory.newInstance().newTransformer();  
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");  
            transformer.transform(source, result);  
        } catch (Exception e) {  
            return;  
        }  
    }  
   static Map<String,Object> mapAll = new HashMap<String, Object>();
    
    public static void main(String[] args) {  
    	String inputxml="<root><head><parameter><hashKey>1dcc108c-45e2-4bac-a05f-0a86e061be9f</hashKey><ApplyIDFrom>50ce51cf-6eb4-4727-9f27-a8e1f3c095b6</ApplyIDFrom><AlipayID>rG0hVXiyZScGap3tc0qHPBlkXv4PbBuA5XowSnf6rfveMcWdmuZUZ6zT1++5zVLL01</AlipayID><AgreementID>20150706028655229290</AgreementID><Optype>1</Optype></parameter></head><body><result>err</result><errMsg>hashKey密钥有误!</errMsg></body></root>";
    	//"<root>  <head>    <parameter><hashKey>640bbc36-b81f-4afa-956e-43b7f04f6968</hashKey>      <AlipayID>oTqovuOnGvo9G7z2XxfQ4btMcQsU</AlipayID>      <BookID>1795632</BookID>      <OptypeReg>0</OptypeReg>      <Isbook>1</Isbook>      <AgreementID>6006219295</AgreementID>    </parameter>  </head>  <body /></root>";
    	 
    	Map<String,Object> map = new HashMap<String, Object>();
    	map = zfbXml(inputxml);
    	System.out.println(map.toString());
    }  
    
    public static Map<String,Object>  zfbXml(String inputxml){
    	Document doc = string2Doc(inputxml);
    	Element root=doc.getDocumentElement() ;
        String rootName=root.getNodeName();
        NodeList list=root.getElementsByTagName("head");//获得节点元素
        showElem(list);
        NodeList listb=root.getElementsByTagName("body");//获得节点元素
        showElem(listb);
        System.out.println(mapAll.toString());
    	return mapAll;
    }
    
    
    
	public static void showElem(NodeList nl){
		
		StringBuilder strbuteValue = new StringBuilder();
		   for(int i=0;i<nl.getLength();i++){
             Node n=nl.item(i);//得到父节点
             if(n.hasChildNodes())
             {
	             NamedNodeMap attributes=n.getAttributes(); //遍历节点所有属性如
	            // System.out.println(attributes.getLength()); 
	             for(int j=0;j<attributes.getLength();j++)
	             {
		              Node attribute=attributes.item(j);
		               //得到属性名
		              String attributeName=attribute.getNodeName();
		              
		             // System.out.println("属性名:"+attributeName);
		              //得到属性值
		              String attributeValue=attribute.getNodeValue();
		             // System.out.println("属性值:"+attributeValue);
		              mapAll.put(attributeName, attributeValue);
		          }//打印出结果属性名
		            
		            
             }
	          //子节点
	          NodeList childList=n.getChildNodes();
	          for(int x=0;x<childList.getLength();x++)
	          {
		            Node childNode=childList.item(x);
		            //判断取出的值是否属于Element元素,目的是过滤掉
		            if(childNode instanceof Element)
		               {
		                   //得到子节点的名字
		                   String childNodeName = childNode.getNodeName();
		                   //得到子节点的值
		                   String childNodeValue=childNode.getTextContent();
		                   if(!"parameter".equals(childNodeName)){
		                	   mapAll.put(childNodeName, childNodeValue);
				              }
		               }
	          }
	          showElem(n.getChildNodes());//递归
		              
		   }
		            
	}
	
	/*2015-7-24 chl*/
	public static void showElem2(NodeList nl){
		Parameter para=new Parameter();	
		
		for(int i=0;i<nl.getLength();i++){
          Node n=nl.item(i);//得到父节点
          if(n.hasChildNodes())
          {
	             NamedNodeMap attributes=n.getAttributes(); //遍历节点所有属性如
	            // System.out.println(attributes.getLength()); 
	             for(int j=0;j<attributes.getLength();j++)
	             {
		              Node attribute=attributes.item(j);
		               //得到属性名
		              String attributeName=attribute.getNodeName();
		              System.out.println("属性名:"+attributeName);
		              //得到属性值
		              String attributeValue=attribute.getNodeValue();
		              System.out.println("属性值:"+attributeValue);
		          }//打印出结果属性名
		            
		            
          }
	          //子节点
	          NodeList childList=n.getChildNodes();
	          for(int x=0;x<childList.getLength();x++)
	          {
		            Node childNode=childList.item(x);
		            //判断取出的值是否属于Element元素,目的是过滤掉
		            if(childNode instanceof Element)
		               {
		                   //得到子节点的名字
		                   String childNodeName=childNode.getNodeName();
		                   //得到子节点的值
		                   String childNodeValue=childNode.getTextContent();
		                   System.out.println(childNodeName+":"+childNodeValue);
		               }
	          }
	          showElem(n.getChildNodes());//递归		              
		   }
		
		
	}
}
