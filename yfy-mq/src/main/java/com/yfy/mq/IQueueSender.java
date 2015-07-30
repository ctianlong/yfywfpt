package com.yfy.mq;

import javax.jms.JMSException;

/**
 * 队列消息发送者
 * @author Administrator
 *
 */
public interface IQueueSender {
	/**
	* 发送消息。
	*
	* @param message
	* 报文。
	* @return
	*/
	public abstract void send(final String message) throws JMSException;
}
