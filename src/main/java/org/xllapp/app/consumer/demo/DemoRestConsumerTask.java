package org.xllapp.app.consumer.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.xllapp.app.consumer.support.RestMessageJMSConsumerTask;

/**
 * 这个DEMO类演示了如何处理来自icity-api-jms模块的消息.
 *
 * @author dylan.chen Nov 2, 2013
 * 
 */
@Service
public class DemoRestConsumerTask extends RestMessageJMSConsumerTask{

	@Value("${userName}")
	private String userName;

	@Value("${password}")
	private String password;

	@Value("${brokerUrl}")
	private String brokerUrl;

	@Value("${queue}")
	private String queue;

	@Override
	public void handleRestMessage(RestMessage message) throws Exception {
		System.out.println("head:"+message.getHeader("head"));
		System.out.println("param:"+message.getParam("param"));
		System.out.println("body:"+message.getBody());
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
