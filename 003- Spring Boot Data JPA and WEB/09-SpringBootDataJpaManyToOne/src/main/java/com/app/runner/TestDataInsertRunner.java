package com.app.runner;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.entity.Department1;
import com.app.entity.Employee2;
import com.app.repository.DepartmentRepository;
import com.app.repository.EmployeeRepository;

@Component
public class TestDataInsertRunner implements CommandLineRunner {
	
	@Autowired
	private DepartmentRepository drepo;
	
	@Autowired
	private EmployeeRepository erepo;
	

	@Override
	public void run(String... args) throws Exception {
		
		Department1 d1 = new Department1(1054,"DEV","AJAY");
		drepo.save(d1);
		
		Employee2 e1 = new Employee2(10,"SAM",500.0,d1);
		Employee2 e2 = new Employee2(11,"RAM",500.0,d1);
		Employee2 e3 = new Employee2(12,"SYED",500.0,d1);
		erepo.save(e1);
		erepo.save(e2);
		erepo.save(e3);
		
		/*Department1 opt = drepo.findByDeptName("DEV");
		
			Integer id=opt.getDeptId();
			System.out.println(erepo.findBydob(opt));
		*/
	}

}
