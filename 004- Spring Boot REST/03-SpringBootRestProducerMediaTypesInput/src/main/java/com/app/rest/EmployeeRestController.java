package com.app.rest;

import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entity.Address;
import com.app.entity.Employee;

@RestController
@RequestMapping("/employee")
public class EmployeeRestController {
	
	@PostMapping("/create")
	public ResponseEntity<String> createEmployee(@RequestBody Employee emp){
		
		String s = emp.toString();
		ResponseEntity<String> respon = new ResponseEntity<>(s,HttpStatus.OK);				
		return respon;
	}

	@GetMapping("/find")
	public ResponseEntity<Employee> getOneEmployee(){
		
   Employee emp = 
 new Employee(101,"AAA",500.0, new Address("A/9","HYD"),List.of("M1","M2"),Map.of("G1",10,"A2",20));
		
		ResponseEntity<Employee> respon = new ResponseEntity<>(emp,HttpStatus.OK);
		return respon;
	}
	
	
}
