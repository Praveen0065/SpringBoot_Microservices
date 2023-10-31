package com.app.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.entity1.Product;
import com.app.repository2.ProductRepository;

@Component
public class TestDataRunner implements CommandLineRunner{
	
	@Autowired
	private ProductRepository repo;

	@Override
	public void run(String... args) throws Exception {
		
		
		repo.save(new Product(101, "AA",200.0));	
		System.out.println("------------------------------");
		
		int count = repo.updateNameById("PEN", 101);
		System.out.println(count);
		
		int count2 = repo.removeById(101);
		System.out.println(count2);
		
		
		
	}

}
