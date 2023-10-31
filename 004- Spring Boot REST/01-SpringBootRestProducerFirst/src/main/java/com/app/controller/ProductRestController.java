package com.app.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("product")
public class ProductRestController {
	
	//1. Fetch Resource
	@GetMapping("/fetch")
	public ResponseEntity<String> getProduct(){                  //body               //status
		ResponseEntity<String> response = new ResponseEntity<>("FROM GET OPERATIONS",HttpStatus.OK); 
		return response;
	}
	

	//2. Create Resource
	@PostMapping("/save")
	 public ResponseEntity<String> createProduct(){
		ResponseEntity<String> respon = new ResponseEntity<>("FROM POST OPERATIONS",HttpStatus.OK); 
		return respon;
	}
	
	//3. Modify Resource
	@PutMapping("/update")
	public ResponseEntity<String> updateProduct() {
		ResponseEntity<String> response = new ResponseEntity<>("FROM PUT OPERATIONS",HttpStatus.OK);
		return response;
	}
		
	//4. Remove Resource
	@DeleteMapping("/delete")
	public ResponseEntity<String> deleteProduct(){
		ResponseEntity<String> response = new ResponseEntity<>("FROM DELETE OPERATIONS",HttpStatus.OK);	
		return response;
	}
	
	//5. Partial Update of Resource
	@PatchMapping("/updatecost")
	public ResponseEntity<String> modifyProductCost(){
		ResponseEntity<String> response = new ResponseEntity<>("FROM MODIFY OPERATIONS",HttpStatus.OK);	
		return response;
	}
	
	
	

}
