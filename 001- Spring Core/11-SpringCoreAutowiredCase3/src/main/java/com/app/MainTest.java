package com.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/*
    If Multiple Beans/Objects found
   NoUniqueBeanDefinitionException: Found multiple, expected one
 */


public class MainTest {

	public static void main(String[] args) {
		
		ApplicationContext ac = new AnnotationConfigApplicationContext(MyAppConfig.class);
		Object ob = ac.getBean("myService");
		System.out.println(ob);

	}

}
