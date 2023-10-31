package com.app;

import com.app.entity1.StockInfo;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Conversion {

	// Java Object to JSON (convert)
	public static void main1(String[] args) {
	
		  StockInfo si = new StockInfo();
		  si.setStkId(101);
		  si.setStkCode("ASK4522");
		  si.setStkCost(120.2);
		  
		  try {
			  // Java Object to JSON (convert)
			ObjectMapper om = new ObjectMapper();
			String s = om.writeValueAsString(si);
			System.out.println(s);
		} catch (Exception e) {
			e.printStackTrace();
		}
      
	}
	
	//JSON to Java Object (convert)
	public static void main(String[] args) {
		
		String json ="{\"stkId\":101,\"stkCode\":\"A\",\"stkCost\":200.0}";
		
		try {
			ObjectMapper om1 = new ObjectMapper();
			StockInfo si = om1.readValue(json, StockInfo.class);
			System.out.println(si);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
