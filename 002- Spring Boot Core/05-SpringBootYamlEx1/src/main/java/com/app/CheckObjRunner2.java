package com.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CheckObjRunner2 implements CommandLineRunner {

	@Autowired
	private EmailConfig1 em;
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println(em);
		
	}

}
