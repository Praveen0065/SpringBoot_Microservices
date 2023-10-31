package com.app.rest6;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.db4.MessageStore;
import com.app.entity1.StockInfo;
import com.app.service3.ProducerService_1;
import com.app.util5.JsonUtil;

@RestController
@RequestMapping("/api/v1/kafka")
public class StockRestController {
	
	@Autowired
	private ProducerService_1 service;
	
	@Autowired
	private MessageStore store;
	
	//send?code__$cost=__
	@GetMapping("/send")
	public String readMessage(
			@RequestParam String code,
			@RequestParam Double cost
			)	
	{   
		// create Entity class object
		StockInfo si = new StockInfo();
		si.setStkCode(code);
		si.setStkCost(cost);
		
		//convert to JSON
		String mess = JsonUtil.convertToString(si);
		
		//call producer service
		service.sendMessage(mess);
		
		
		return "SENT";
	}
	
	@GetMapping("/all")
	public List<StockInfo> fetchAll(){
		return store.getAll();
	}

}
