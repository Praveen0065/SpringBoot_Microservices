package com.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {
	
	public static void main(String[] args) {
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("config.xml");
		Employee e = ac.getBean("e1",Employee.class);
		System.out.println(e);
		
	}

}
