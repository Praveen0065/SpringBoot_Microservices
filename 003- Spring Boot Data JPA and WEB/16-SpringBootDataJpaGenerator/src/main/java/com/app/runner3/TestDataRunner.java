package com.app.runner3;

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
		
		Product p1 = new Product();
		p1.setProdName("BOOK");
		p1.setProdCost(300.1);
		
		p1 = repo.save(p1);
		System.out.println(p1);
				
	
		
	}

}
