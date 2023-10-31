package com.app.runner1;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
//@Profile("default")
@Profile({"qa","default","uat"})
public class DbUserSetupRunner2 implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		System.out.println("FROM DBUSER SETUP RUNNER..");

	}

}