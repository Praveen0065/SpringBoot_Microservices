package com.app.runner1;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
//@Profile({"prod","prodsup","uat"})
@Profile("prod")
public class BackDataServiceRunner3 implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		System.out.println("BACK DATASERVICE RUNNER..");

	}

}
