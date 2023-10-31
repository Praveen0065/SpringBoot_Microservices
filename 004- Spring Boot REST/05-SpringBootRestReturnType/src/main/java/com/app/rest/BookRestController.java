package com.app.rest;



import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entity.Book;

@RestController
@RequestMapping("/book")
public class BookRestController {
	       
	        @GetMapping("/a")
	        public String justBody() {
		       return "HELLO BOOK DATA";
	         }  
	        
	        @GetMapping("/b")
	        public Book justBook() {
	        	return new Book(101,"SMBS",250.2);
	        }
	  
	
	        @GetMapping("/data")
	        public ResponseEntity<String>  showInfo(){
		   
		   //1. passing Http Status
		   //ResponseEntity<String> respon = new ResponseEntity<>(HttpStatus.OK);
		   
		   //2. passing Body + Http Status
		   //String body = "WELCOME TO APP";
		   //ResponseEntity<String> respon = new ResponseEntity<>(body,HttpStatus.OK);
		   
		   //3. Passing  headers + status
			HttpHeaders headers = new HttpHeaders();
			headers.add("MyAppOne", "ACTIVATED-CLIENT");
			//ResponseEntity<String> response = new ResponseEntity<>(headers, HttpStatus.OK);
		   
		   //4. Passing body + headers + status
			String body = "WELCOME TO APP";
			ResponseEntity<String> response = 
					new ResponseEntity<>(body, headers, HttpStatus.OK);
			
			return response;
		   
	   }
	   
	   

}
