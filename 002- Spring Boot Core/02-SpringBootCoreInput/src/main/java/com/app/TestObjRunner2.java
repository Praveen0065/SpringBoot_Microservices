package com.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class TestObjRunner2 implements CommandLineRunner {
	
	@Autowired
	private DataBaseConfg1 con;

	@Override
	public void run(String... args) throws Exception {
		System.out.println(con); // DataBaseConfg1 [driver=Oracle, url=jdbc:oracle:thin:xyz, user=root, password=sample]
		
		
	}

}
