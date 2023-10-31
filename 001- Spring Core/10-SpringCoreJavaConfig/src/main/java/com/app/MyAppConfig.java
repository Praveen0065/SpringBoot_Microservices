package com.app;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;

@Configurable
public class MyAppConfig {

	// 1 method = 1 object
	@Bean
	public DriverManager conObj() {
       
		DriverManager dm = new DriverManager();
		dm.setDriverClass("ORACLE");
		dm.setUrl("JDBC:ORACLE");
		return dm;
      
	}
	
}
