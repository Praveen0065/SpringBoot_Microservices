package com.app.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.app.bean.User;

@Controller
public class UserController {
	
	@GetMapping("/hello")
	public String showPage(Model model) {
		
		System.out.println(model.getClass().getName());
		
		model.addAttribute("uname", "PRAVEEN");
		model.addAttribute("cname", "SMBS");		
		return "HelloUser";
		
	}
	
	@GetMapping("/user")
	public String userPage(Model model) {
		
		User user = new User(101,"PRAVEEN", "SYS");		
		model.addAttribute("objec", user);
		
		
		
		List<User> list = Arrays.asList(
				
				new User(10,"AA","XYZ"),
				new User(11,"AB","XYZ"),
				new User(12,"AC","MNO"),
				new User(13,"AD","MNO")			
				
				);
		
		model.addAttribute("ListObjec", list);
		
		
		
		return "UserData";
	}

}
