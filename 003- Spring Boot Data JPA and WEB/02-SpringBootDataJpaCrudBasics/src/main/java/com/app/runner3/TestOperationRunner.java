package com.app.runner3;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.entity1.Product;
import com.app.exception4.ProductNotFoundException;
import com.app.repository2.ProductRepository;

@Component
public class TestOperationRunner implements CommandLineRunner {

	@Autowired
	private ProductRepository repo;
	
	
	@Override
	public void run(String... args) throws Exception {
		
		Product p1 = new Product(11,"P2",300.1);
		Product p2 = new Product(12,"P3",400.1);
		Product p3 = new Product(13,"P4",500.1);
		
		Product p4 = new Product(14,"P2",300.1);
		Product p5 = new Product(15,"P3",400.1);
		Product p6 = new Product(16,"P4",500.1);
		
		/*repo.save(p1);  
		repo.save(p2);
		repo.save(p3);*/
		repo.saveAll(Arrays.asList(p1,p2,p6));
		
	
	  Iterable<Product> data = repo.findAll();
	  //JDK 1.5 forEach Loop
	  for(Product pob : data) {
		  System.out.println(pob);
	  }
	  
	   System.out.println("--------------");
		//JDK 1.8 Default method + Lambda Expression
		data.forEach(ob-> System.out.println(ob));
		
		System.out.println("************");
		//JDK 1.8 Default method + Method References
		data.forEach(System.out::println);
		
		System.out.println("-------------");
		System.out.println(repo.existsById(11)); //true	
		System.out.println(repo.existsById(55)); // false
		
		System.out.println("-------------");
		System.out.println(repo.count()); // No of rows in table
		
		//---------------------------------------------------//
		 System.out.println("************");
		 
	    Optional<Product> opt = repo.findById(16);
		if(opt.isPresent()) {
			Product p = opt.get();
			System.out.println(p);
			//System.out.println(opt.get());
		}
		else {
			System.out.println("NO RECORD FOUND");
		}
		System.out.println("****************");
	     
	     
		/*Product p11 = repo.findById(1)
				.orElseThrow(() -> new ProductNotFoundException("NOT EXIST"));
		System.out.println(p11);*/
		
		
		Iterable<Product> list =  repo.findAllById(Arrays.asList(11,12,13));
		//System.out.println(list);
		list.forEach(System.out::println);
		    
	    //-------------------------------------------------// 
	     System.out.println("--------------------");
	     
	    // repo.deleteById(16);
	    // repo.deleteById(89);
	     
	   //  repo.deleteAllById(Arrays.asList(11,12));
		
		
	}

}
