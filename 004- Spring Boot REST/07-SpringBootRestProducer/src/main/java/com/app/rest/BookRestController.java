package com.app.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.PutExchange;

import com.app.entity.Book;

@RestController
@RequestMapping("/v1/api/book")
public class BookRestController {
	
	@GetMapping("/showA")
	public ResponseEntity<String> showMsg1(){
	//	return new ResponseEntity<>("WELCOME",HttpStatus.OK);
		return ResponseEntity.ok("WELCOME TO FIRST CALL TYPE - GET");
	}
	
	@GetMapping("/showB/{id}/{name}")
	public ResponseEntity<String> showMsg2(
			  @PathVariable("id")Integer id,
			  @PathVariable("name")String name
			){
		return ResponseEntity.ok("WELCOME TO FIRST CALL TYPE - GET ==>" +id+ "-"+ name );
	}
	
	@GetMapping("/showC")
	public ResponseEntity<Book> showMsg3(){
			
		return ResponseEntity.ok(new Book(101,"ABC","PRAV",501.2) );
	}
	
	//---------------------------------------
	
	@PostMapping("/showD")
	public ResponseEntity<String> showMgs4(
			@RequestBody Book book
			) 
	{
		return ResponseEntity.ok("Data given is " + book);
	}
	
	//---------------------------------------
	
	@PutMapping("/showE")
	public ResponseEntity<String> showMsg5(
			@RequestBody Book book
			){
			
		return ResponseEntity.ok("Data given is " + book);
	}
	
	@DeleteMapping("/showF/{id}")
	public ResponseEntity<String> showMsg6(
        @PathVariable("id")Integer id
	){
			
		return ResponseEntity.ok("DELETE MAPPING"+id);
	}

}
