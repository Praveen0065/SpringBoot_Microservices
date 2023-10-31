package com.app.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ProcessCRestController {
	
	private static final Logger log = LoggerFactory.getLogger(ProcessCRestController.class);
	
	@Autowired
	private RestTemplate rt;
	
	@GetMapping("/showC")
	private String showmMsg() {
		log.info("WE ARE AT C SERVICE..");
		
		//some logic
		log.info("WE ARE FROM SERVICE C ..");
		
		
		return "FROM C.." ;
		
		
		
		
	}

}
