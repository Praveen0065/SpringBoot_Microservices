package com.app.runner3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.entity1.Student;
import com.app.repository2.StudentRepository;

@Component
public class TestOprRunner  implements CommandLineRunner {
	
	@Autowired
	private StudentRepository repo;

	@Override
	public void run(String... args) throws Exception {
      Student sob = new Student();
      sob.setStdId(99);
      sob.setStdName("Praveen");
      sob.setStdFee(1000.1);
      
      repo.save(sob); // Insert or Update
		
	}

}
