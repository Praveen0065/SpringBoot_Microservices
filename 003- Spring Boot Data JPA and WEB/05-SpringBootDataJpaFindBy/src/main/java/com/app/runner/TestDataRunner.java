package com.app.runner;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.entity.Book;
import com.app.repository.BookRepository;

@Component
public class TestDataRunner implements CommandLineRunner {
	
	@Autowired
	private BookRepository repo;

	@Override
	public void run(String... args) throws Exception {
		
		repo.saveAll(Arrays.asList(
				
				new Book(101, "SBMS", "PRAVEEN", 300.0, "Backend"),
				new Book(102, "CORE", "DASARI", 200.0, "Backend"),
				new Book(103, "ADV", "LOKESH", 400.0, "Backend"),
				new Book(104, "REACT", "SANTHOSH", 500.0, "Frontend"),
				new Book(105, "HTML", "HARI", 600.0, "Frontend")
				
				));
		
		//-----------------------------------------//
		System.out.println("*******************");
		
		repo.findByAuthor("LOKESH").forEach(System.out::println);
		
		repo.findByBookType("Backend").forEach(System.out::println);
		
		//----------------------------------------------//
		System.out.println("*******************");
		
		repo.findByBookCostLessThanEqual(500.0)
		.forEach(System.out::println);
		
		
		
		//------------Like Operator---------//
		System.out.println("*******************");
		
		//repo.findByAuthorLike("P%")
		repo.findByAuthorStartingWith("D")
		.forEach(System.out::println);
		
		//repo.findByAuthorLike("%H")
		repo.findByAuthorEndingWith("H")
		.forEach(System.out::println);
		
		//containing
		repo.findByAuthorLike("%R%")
		.forEach(System.out::println);	     
		repo.findByAuthorContaining("R")
		.forEach(System.out::println);
		
		System.out.println("*******************");
		
		repo.findByBookIdLessThanEqualOrBookTypeLike(105, "Front%")
		.forEach(System.out::println);
		
		System.out.println("%%%%%%%%%%");
		repo.findByBookIdBetween(102, 105)
		.forEach(System.out::println);
		
		//-------Single row-------------
		System.out.println("----------------");
		Optional<Book> opt = repo.findByBookId(104);
		if(opt.isPresent()) {
			System.out.println(opt.get());
		}
		else {
		   System.out.println("No data found...");	
		}
		
		

		
		
	}

}
