package com.app.rest;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entity.Role;
import com.app.entity.User;

@RestController
@RequestMapping("/user")
public class UserRestController {
	
	@GetMapping("/one")
	public ResponseEntity<User> getOneObj(){
		
		 User ob = new User(101,"ABC","DEV","Prav123",Set.of("P1","P2"),Map.of("M1","AA","M2","BB"));
		 
		 ResponseEntity<User> respon = new  ResponseEntity<>(ob,HttpStatus.OK);
		 return respon;
	}
	
	
	@GetMapping("/list")
	public ResponseEntity<List<Role>> getAllRoles(){
		
		List<Role> roles = Arrays.asList(
				
				      new Role(1100, "ADMIN"),
				      new Role(1102, "BA"),
				      new Role(1103, "QA")
				);	
		ResponseEntity<List<Role>> respons = new ResponseEntity<>(roles,HttpStatus.OK);
		return respons;
	}
      
	  @GetMapping("/map")
      public ResponseEntity<Map<String, Role>> getMapRoled(){
    	  
    	  Map<String, Role> roles = Map.of(
    			  
    			    "R1", new Role(1100, "ADMIN"),
					"R2", new Role(1102, "BA"),
					"R3", new Role(1103, "QA")
    			  );
    	  
    	  ResponseEntity<Map<String, Role>> respon = new ResponseEntity<>(roles,HttpStatus.OK);
    	  return respon;
      }
	
	

}
