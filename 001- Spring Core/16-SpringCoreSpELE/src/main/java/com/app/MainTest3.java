package com.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainTest3 {
	
	public static void main(String[] args) {
		
		ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig2.class);
		Process1 opr = ac.getBean("process1",Process1.class);
		System.out.println(opr);
		
		/*ModelData4 omod = ac.getBean("modelData4", ModelData4.class);
		System.out.println(omod);*/
		
	}

}
