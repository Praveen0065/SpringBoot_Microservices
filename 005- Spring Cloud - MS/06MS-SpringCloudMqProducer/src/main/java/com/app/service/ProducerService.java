package com.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Component;

import jakarta.jms.JMSException;
import jakarta.jms.Message;
import jakarta.jms.Session;
import jakarta.jms.TextMessage;

@Component
public class ProducerService {
	
	@Autowired
	private JmsTemplate jt;
	
	
	@Value("${my.app.desti-name}")
	private String destination;
	
	public void sendMessage(String message) {
		jt.send(destination,session -> session.createTextMessage(message));
		System.out.println("MESSAGE SENT FROM PRODUCER " + message);
		
		/*jt.send(destination, new MessageCreator() {
			public Message createMessage(Session session) throws JMSException {
				TextMessage tm = session.createTextMessage(message);
				return tm;
			}
		});*/

	}

}
