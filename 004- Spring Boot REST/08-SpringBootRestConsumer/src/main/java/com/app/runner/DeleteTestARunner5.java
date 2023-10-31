package com.app.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class DeleteTestARunner5  implements CommandLineRunner{

	@Override
	public void run(String... args) throws Exception {
	   
		//URL
		String url = "http://localhost:8080/v1/api/book/showF/{id}";
		
		// Body,Headers => 
		
		
		//RequestEntity

		
		// RestTemplate
		RestTemplate temp = new RestTemplate();
		// make call
		
		ResponseEntity<String> response = temp.exchange(url, HttpMethod.DELETE, null, String.class,101);
		
		// print Response
		System.out.println(response.getBody());
		System.out.println(response.getHeaders());
		//System.out.println(response.getStatusCode().name());
		System.out.println(response.getStatusCode().value());
		
	
		
		
	}

}
