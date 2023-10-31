package com.app.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

//@Component
public class GetTestBRunner2 implements CommandLineRunner{

	@Override
	public void run(String... args) throws Exception {
		
		//1. Create URL
		String url = "http://localhost:8080/v1/api/book/showB/{id}/{name}";
		
		//2. Create Request Headers
		
		//3. Create request Body
		
		//2+3
		
		//4. Create RestTemplate Object
		RestTemplate template = new RestTemplate();
		
		//5. Make HTTP Call and Get Response back
		ResponseEntity<String> respon = template.getForEntity(url,
				     String.class,
				     101,"ABC"				     
				    ); 
		
		//6. print details
		System.out.println(respon.getBody());
		System.out.println(respon.getHeaders());
		System.out.println(respon.getStatusCode().value());

			
	}

}
