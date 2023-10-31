package com.app.runner3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import com.app.entity1.Employee;
import com.app.repository2.EmployeeRepository;

@Component
public class TestPageRunner implements CommandLineRunner{
	
	@Autowired
	private EmployeeRepository repo;

	@Override
	public void run(String... args) throws Exception {
		
		System.out.println("****************");
		
		//input
		Pageable p = PageRequest.of(0, 2);
		
		//output
		Page<Employee> page = repo.findAll(p);
		
		//result
		page.getContent()
		.forEach(System.out::println);
		
		//metadata
		System.out.println(page.isFirst());
		System.out.println(page.isLast());
		System.out.println(page.isEmpty());
		System.out.println(page.hasNext());
		System.out.println(page.hasPrevious());
		System.out.println(page.getTotalPages());
		System.out.println(page.getTotalElements());
		System.out.println(page.getSize());
		System.out.println(page.hasContent());
		
	}

}
