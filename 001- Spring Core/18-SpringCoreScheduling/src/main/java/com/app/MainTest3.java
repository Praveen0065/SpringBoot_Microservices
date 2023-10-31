package com.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainTest3 {
	
	public static void main(String[] args) {
		
		ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig1.class);
		ProductReportService2 p = ac.getBean(ProductReportService2.class);
		System.out.println(p);
		
	}

}
