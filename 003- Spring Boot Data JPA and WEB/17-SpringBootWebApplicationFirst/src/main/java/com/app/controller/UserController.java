package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
	
   //@RequestMapping(value = "/path", method = RequestMethod.GET)  
    @GetMapping("/home")	
	public String showPage() {
		return "UserHome";
	}
    
    
   
}
