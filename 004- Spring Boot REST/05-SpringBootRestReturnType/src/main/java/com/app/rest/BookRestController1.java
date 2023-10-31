package com.app.rest;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entity.Book;

@RestController
@RequestMapping("/book")
public class BookRestController1 {
	
	
	//Path variable id --> Book (200,book,found=yes), String(400,Sorry No Book found, found=no)
	@GetMapping("/obj/{id}")
	public ResponseEntity<?> findBookById(@PathVariable Integer id){
		
		ResponseEntity<?> response =null;
		HttpHeaders headers = new HttpHeaders();		
		if(id==201) {
			headers.add("found", "yes");
			response = new ResponseEntity<Book>(				        
					    new Book(id,"DUMMY",500.2),headers,HttpStatus.OK);
			
		}
		else {
			headers.add("found", "no");
			response = new ResponseEntity<String>(				        
					    "NO BOOK FOUND", // body
					    headers, // headers
					    HttpStatus.BAD_REQUEST); // http status
		}
		return response;
		
	}

}
