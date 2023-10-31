package com.app.runner2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.dbcon1.MyDbConnection1;

@Component
public class TestDataRunner2 implements CommandLineRunner {
	
	@Autowired
	private MyDbConnection1 con;

	@Override
	public void run(String... args) throws Exception {
		
		System.out.println(con);

	}

}
