
package com.yfy.mq.queue;
import java.rmi.RemoteException;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.log4j.Logger;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.springframework.jms.listener.SessionAwareMessageListener;

import com.yfy.webservice.alipaybook.BookSoapProxy;

public class QueueReceiverListener implements SessionAwareMessageListener{
	private static Logger log = Logger.getLogger(QueueReceiverListener.class);
	public void onMessage(Message message, Session session) throws JMSException
	{
	  //1.接收报文
	   TextMessage msg = (TextMessage)message;
	  if(log.isDebugEnabled()){
	       log.debug("QueueReceiverListener接收到报文：" + msg.getText());
	    }
	    //3.调用接口，处理业务
	  	/**
		 * 需要执行的任务: 调用 预约 接口
		 */
		BookSoapProxy proxy = new BookSoapProxy();
		/**
		 * 将字符串转化为document.
		 */
		String text = msg.getText();
		try {
			Document document = DocumentHelper.parseText(text);

			Element rootElement = document.getRootElement();
			Element element = rootElement.element("head");
			Element parameter = element.element("parameter");
			
			String hashKey = parameter.element("hashKey").getText();
			String optype = parameter.element("Optype").getText();
			String hospitalID = parameter.element("HospitalID").getText();
			String alipayID = parameter.element("AlipayID").getText();
			String agreementID = parameter.element("AgreementID").getText();
			String aemplateID = parameter.element("TemplateID").getText();
			String cardNo = parameter.element("CardNo").getText();
			
			
		} catch (DocumentException e) {
			e.printStackTrace();
		}
	    //4.发送返回消息(可省略)
	}
}