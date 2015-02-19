package org.xllapp.app.consumer.demo;

import javax.jms.Message;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.xllapp.app.consumer.support.JMSConsumerTask;

/**
 * 消息处理程序的Demo.
 *
 * @author dylan.chen Dec 30, 2013
 * 
 */
@Service
public class DemoJMSConsumerTask extends JMSConsumerTask {

	@Value("${userName}")
	private String userName;

	@Value("${password}")
	private String password;

	@Value("${brokerUrl}")
	private String brokerUrl;

	@Value("${queue}")
	private String queue;

	@Override
	public void handleMessage(Message message) throws Exception {
		
	}

	@Override
	public String getBrokerUrl() {
		return this.brokerUrl;
	}

	@Override
	public String getUserName() {
		return this.userName;
	}

	@Override
	public String getPassword() {
		return this.password;
	}

	@Override
	public String getQueue() {
		return this.queue;
	}

}
