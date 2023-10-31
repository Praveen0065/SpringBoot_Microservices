package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/prod")
public class ProductController {

	@GetMapping("/data")
	//@GetMapping({"/info","/data"}) for multiple paths 
	public String showProd() {
		return "ProdData";
	}
	
}
