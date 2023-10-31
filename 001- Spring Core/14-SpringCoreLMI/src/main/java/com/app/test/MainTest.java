package com.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.app.config.AppConfig;
import com.app.service.Token;
import com.app.service.TokenService;

public class MainTest {
	
	public static void main(String[] args) {
		
		ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		//reading first time
		TokenService ts1 = ac.getBean("tokenService",TokenService.class);
		Token tk1 = ts1.getToken();
		System.out.println(tk1);

		
		
	}

}
