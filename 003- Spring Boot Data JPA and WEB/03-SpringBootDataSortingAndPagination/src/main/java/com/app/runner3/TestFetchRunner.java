package com.app.runner3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import com.app.entity1.Employee;
import com.app.repository2.EmployeeRepository;

@Component
@Order(value = 2)
public class TestFetchRunner implements CommandLineRunner {
	
	@Autowired
	private EmployeeRepository repo;

	@Override
	public void run(String... args) throws Exception {
        
		//---case 1  ASC order
		//Iterable<Employee> data = repo.findAll(Sort.by("empSal"));
		Iterable<Employee> data = repo.findAll(Sort.by("empSal").ascending());
		data.forEach(System.out::println);
		
		//---case 2  DESC order
		Iterable<Employee> data1 = repo.findAll(Sort.by("empSal").descending());
		data1.forEach(System.out::println);
		
		//---case 3  ASC order
	    Iterable<Employee> data2 = repo.findAll(Sort.by("empSal","empDept").ascending());
		data2.forEach(System.out::println);
		
		//---case 4  DESC order
	    Iterable<Employee> data3 = repo.findAll(Sort.by("empSal","empDept").descending());
		data3.forEach(System.out::println);
		
		
		
		
		
		
		/*for(Employee emp : data) {
			System.out.println(emp);
		}*/
		
		
		
      
	}

}
