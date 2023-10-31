package com.app.runner;

import java.util.List;
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
		Department1 d2 = new Department1(1055,"QA","SAM");
		Department1 d3 = new Department1(1056,"BA","KUMAR");
		drepo.save(d1);
		drepo.save(d2);
		drepo.save(d3);
		
		Employee2 e1 = new Employee2(10, "SAM", 500.0, d1);
		Employee2 e2 = new Employee2(11, "RAM", 600.0, d2);
		Employee2 e3 = new Employee2(12, "SYED", 700.0, d1);
		Employee2 e4 = new Employee2(13, "AJAY", 700.0, null);
		
		erepo.save(e1);
		erepo.save(e2);
		erepo.save(e3);
		erepo.save(e4);
		
		
		// INNER JOIN-----------------------------
		List<Object[]> list1 = erepo.getEnameDeptNames();
		
		for(Object[] ob : list1) {
			
			System.out.println(ob[0] + "--IS WORKING ON DEPT--"+ob[1]);
		}
		//-------------------------------------------
		
		System.out.println("*********************");
		
		// LEFT OUTER JOIN----------------------------
		List<Object[]> list2 = erepo.getAllEnameAndDeptNamesIfExist();
		
		for(Object[] ob1 : list2) {
			System.out.println(ob1[0] + "--IS WORKING ON DEPT--"+ob1[1]);
		}
		
		
		System.out.println("##############");
		
		// RIGHT OUTER JOIN----------------------------
		List<Object[]> list3 = erepo.getAllDeptsAndENamesIfExist();
				
		for(Object[] ob3 : list3) {
		 	System.out.println(ob3[0] + "--IS WORKING ON DEPT--"+ob3[1]);
		}
		
		System.out.println("********full join**********");
		
		// FULL JOIN-------------
		/*List<Object[]> list4 = erepo.getAllData();
		
		for(Object[] ob4 : list4) {
			System.out.println(ob4[0] + "--IS WORKING ON DEPT--"+ob4[1]);
		}*/
		
		
		System.out.println("***********************");
		
		List<Object[]> list5 = erepo.getEnameDeptNames("DEV");
		
		for(Object[] ob5 : list5) {
		 	System.out.println(ob5[0] + "--IS WORKING ON DEPT--"+ob5[1]);
		}
		
		
		/*Department1 opt = drepo.findByDeptName("DEV");
		
			Integer id=opt.getDeptId();
			System.out.println(erepo.findBydob(opt));
		*/
	}

}
