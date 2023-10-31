package my.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		ViewResolver vr = (ViewResolver) ac.getBean("vobj");
		System.out.println(vr);
		
		
	}

}
