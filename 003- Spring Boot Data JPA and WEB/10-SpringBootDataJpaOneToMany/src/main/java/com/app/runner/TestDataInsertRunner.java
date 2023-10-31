package com.app.runner;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.entity.Model1;
import com.app.entity.Product2;
import com.app.repository.ModelRepository;
import com.app.repository.ProductRepository;

@Component
public class TestDataInsertRunner  implements CommandLineRunner {
	
	@Autowired
	private ModelRepository mrepo;
	
	@Autowired
	private ProductRepository prepo;

	@Override
	public void run(String... args) throws Exception {
		
		Model1 m1 = new Model1(1012, "XYZ-A", "4GB-128GB-RED");
		Model1 m2 = new Model1(1013, "XYZ-B", "6GB-256GB-GREEN");
		Model1 m3 = new Model1(1014, "MN-C", "12GB-512GB-PINK");
		Model1 m4 = new Model1(1011, "MN-D", "2GB-64GB-BLACK");
		
		mrepo.saveAll(Arrays.asList(m1,m2,m3,m4));
		
		
	   Product2 p1 = new Product2(10, "ABCD-XYZ", Arrays.asList(m1,m2));
	   Product2 p2 = new Product2(11, "ABCD-MN", Arrays.asList(m3,m4));
	   
	   prepo.saveAll(Arrays.asList(p1,p2));
		
		
		
		
	}

}
