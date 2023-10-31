package com.app.runner;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Component;

import com.app.entity.Student;
import com.app.repository.StudentRepository;

@Component
public class StudentTestRunner implements CommandLineRunner {
    
	@Autowired
	private StudentRepository repo;
	
	@Override
	public void run(String... args) throws Exception {
		
		/*Student s1 = new Student();
		s1.setStdName("RAM");
		s1.setStdFee(500.0);
		s1.setStdDoj(new Date());
		repo.save(s1);*/
		
		System.out.println("*************");
		
		List<Student> list = repo.findAll();
		list.forEach(System.out::println);
		
		System.out.println("*************");
		
		Student sob = new Student();
		sob.setStdName("SAM");
		sob.setStdFee(400.0);
		
		Example<Student> prob = Example.of(sob);
		
		/*Iterable<Student> data =  repo.findAll(prob);
		for(Student stu : data) {
			System.out.println(stu);
		}*/
		
	    repo.findAll(prob).forEach(System.out::println);

	}

}
