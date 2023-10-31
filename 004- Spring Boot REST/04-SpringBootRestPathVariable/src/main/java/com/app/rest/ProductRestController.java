package com.app.rest;

import java.util.Enumeration;
import java.util.Random;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/product")
public class ProductRestController {
	
	  //using request param
	// .../dataa?pid=10&pname=A
	@GetMapping("/dataA")
	public ResponseEntity<String> showDataA(
			
			@RequestParam("pid")Integer id,
			@RequestParam("pname")String name
			
			)
	{   
		System.out.println("PID : " +id+ "PNAME : "+name);
		return new ResponseEntity<String>("CHECK AT CONSOLE",HttpStatus.OK);
		
	}
	

	  // using pathVariable
	//.../datab/10/A
	@GetMapping("/dataB/{pid}/{pname}")
	public ResponseEntity<String> showDataB(
			
			@PathVariable("pid") Integer id,
			@PathVariable("pname") String name
			)
	
	{		
		System.out.println("PID : " + id + "PNAME : "+name);	
		ResponseEntity<String> respon = new ResponseEntity<>("PID : " + id + " PNAME : "+name,HttpStatus.OK);
		return respon;
		
	}
	
	
	@PostMapping("details")
	public ResponseEntity<String> showHeaders(
			
			@RequestHeader("Content-type")String type,
			@RequestHeader("Content-Length")String len,	
			@RequestHeader("Authorization")String auth,
			HttpServletRequest req			
			)
	{
		System.out.println(auth);
       Enumeration<String> names = req.getHeaderNames();
       while(names.hasMoreElements()) {
    	     String hdr = names.nextElement();
    	     System.out.println(hdr + " "+req.getHeaders(hdr));
       }
		System.out.println("Data" +type+ "-" +len);
		return new ResponseEntity<>("CHECK",HttpStatus.OK);
	}
	
	
	public ResponseEntity<?> showInfo(){
		
		if(new Random().nextInt() > 0) {
			return new ResponseEntity<String>("OK",HttpStatus.OK);
		}
		else
		{
			return new ResponseEntity<Integer>(101,HttpStatus.OK);
		}
	}
	
	

}
