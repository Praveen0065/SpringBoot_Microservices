package my.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainTest {
	
	public static void main(String[] args) {
		
		//1 first create empty container
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext();
		
		//2 find all classes from given Base package(package and sub packages)
		ac.scan("my.app"); 
		
		//3 refresh spring container
		ac.refresh(); 
		
		//4 Read Object
		HandlerInfo ob = ac.getBean("hob", HandlerInfo.class);
		
		//5 print
		System.out.println(ob);
		
	}

}
