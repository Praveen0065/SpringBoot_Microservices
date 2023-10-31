package com.app.runner;

import java.util.Arrays;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.Entity.Employee;
import com.app.repository.EmployeeRepository;

@Component
public class TestEmployeeSaveRunner implements CommandLineRunner {
	
	@Autowired
	private EmployeeRepository repo;

	@Override
	public void run(String... args) throws Exception {
		
		repo.saveAll(
		      Arrays.asList(
		    		             new Employee(101, "AA", 200.0, "DEV"),
								 new Employee(102, "BA", 500.0, "DEV"),
								 new Employee(103, "AC", 200.0, "QA"),
								 new Employee(104, "DD", 400.0, "QA"),
								 new Employee(105, "EF", 600.0, "DEV")
						
				));	
		
		
		repo.getAllEmpNames().forEach(System.out::println);
		
		System.out.println("***********");
		
		repo.fetchAllEmps().forEach(System.out::println);
		
		System.out.println("***********");
		
		repo.fetchIdAndNames()
		.stream()
		.map(obj -> obj[0] + " : " + obj[1])	
		.forEach(System.out::println);
		
		System.out.println("***********");
		
		Optional<String> opt =  repo.getEmpNameById(105);
		if(opt.isPresent()) {
			System.out.println(opt.get());
		}
		else {
			System.out.println("NO DATA FOUND...");
		}
		
		
		System.out.println("***********");
		
		Employee e =  repo.fetchEmployeeById(105)
				.orElseThrow(()-> new RuntimeException("Not Found"));
		System.out.println(e);
	}
	
	

}
