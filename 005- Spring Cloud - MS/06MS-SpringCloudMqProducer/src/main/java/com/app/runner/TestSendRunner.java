package com.app.runner;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.app.service.ProducerService;

@Component
public class TestSendRunner {
//implements CommandLineRunner {
	
	@Autowired
	private ProducerService service;

	
	//public void run(String... args) throws Exception {
	   @Scheduled(cron = "*/10 * * * * *")
	   public void sendMsgTest() throws Exception {
		service.sendMessage("HELLO : " + new Date());

	}

}
