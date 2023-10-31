package com.app.rest1;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.exception3.ProductNotFoundException;

@RestController
@RequestMapping("/product")
public class ProductRestController {
	
	
	@GetMapping("/one/{id}")
	public ResponseEntity<String> getProductById(
			@PathVariable("id") Integer id){
		
		if(id==101) {
			return new ResponseEntity<>("PRODUCT FOUND",HttpStatus.OK);
		}
		else
		{
			//throw new RuntimeException("Product Not Found" + id);
			throw new ProductNotFoundException("Product Not Found" + id);
		}
		
	}
	
	
	

}
