package com.yfy.mq.queue;

import javax.annotation.Resource;
import javax.jms.Destination;  
import javax.jms.JMSException;  
import javax.jms.Message;  
import javax.jms.Session;  
  




import org.apache.activemq.command.ActiveMQQueue;  
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;  
import org.springframework.jms.core.MessageCreator; 

import com.yfy.mq.IQueueSender;


/**
 * 队列消息发送者
 * @author Administrator
 *
 */
public class QueueSender  implements IQueueSender {

	  // 发送消息的目的地  
    private Destination destination;  
      
    @Autowired
    private JmsTemplate jmsTemplate;  
      
    public QueueSender(ActiveMQQueue queue){  
        this.destination = queue;  
    } 
    /** 
     * 发送消息。 
     *  
     * @param message   报文。 
     * @return 
     */  
    public void send(final String message) throws JMSException  
    {  
  
        jmsTemplate.send(destination, new MessageCreator()  
        {  
              
            public Message createMessage(Session session) throws JMSException  
            {  
  
                return session.createTextMessage(message);  
            }  
        });  
    }  
      
    public void setJmsTemplate(JmsTemplate jmsTemplate)  
    {  
  
        this.jmsTemplate = jmsTemplate;  
    }  
}
