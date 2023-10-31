package com.app.db4;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.app.entity1.StockInfo;
import com.app.respository2.StockRepo;
import com.app.util5.JsonUtil;

@Component
public class MessageStore {
	
	@Autowired
	private StockRepo repo;

	public void add(String message) {		
		StockInfo si = JsonUtil.convertToObj(message);
		repo.save(si);
	}
	
	public List<StockInfo> getAll(){
		return repo.findAll();
	}

}
