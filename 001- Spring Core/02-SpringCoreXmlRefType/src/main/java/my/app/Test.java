package my.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("config.xml");
		Service s = (Service) ac.getBean("sobj");
		System.out.println(s);
		
		
	}

}
