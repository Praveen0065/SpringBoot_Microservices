package com.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainTest {
	public static void main(String[] args) {
		
		ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		Format fb = ac.getBean("format", Format.class);
		System.out.println(fb);
		
	}

}
