package com.app.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.entity.Product;
import com.app.entity.Vendor;
import com.app.repository.ProductRepository;
import com.app.repository.VendorRepository;

@Component
public class TestDataInsert implements CommandLineRunner {
	
	@Autowired
	private VendorRepository vrepo;
	
	@Autowired
	private ProductRepository prepo;

	@Override
	public void run(String... args) throws Exception {
		
		Vendor v1 = new Vendor(1122,"PRAVEEN","GDK");
		vrepo.save(v1);
		
		Product p1 = new Product(10,5000.0,"IPHONE",v1);
		Product p2 = new Product(11,3000.0,"SAMSUNG",v1);
		Product p3 = new Product(12,2000.0,"REDMI",v1);
		prepo.save(p1);
		prepo.save(p2);
		prepo.save(p3);
		
		
		
		
	}

}
