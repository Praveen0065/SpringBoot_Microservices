package com.app.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.app.MyAppConfig;

public class MainTest {
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(MyAppConfig.class);
		Object ob = ac.getBean("con");
		System.out.println(ob);
				
		
	}

}
