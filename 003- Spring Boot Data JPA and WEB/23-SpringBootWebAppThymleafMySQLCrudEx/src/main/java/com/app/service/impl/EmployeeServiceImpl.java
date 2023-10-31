package com.app.service.impl;

import java.awt.print.Pageable;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.app.EmployeeUtil;
import com.app.entity.Employee;
import com.app.exception.EmployeeNotFoundException;
import com.app.repository.EmployeeRepository;
import com.app.service.IEmployeeService;

@Service
public class EmployeeServiceImpl implements IEmployeeService {
	
	@Autowired
	private EmployeeRepository repo;
	
	//@Autowired
	//private EmployeeUtil util;

	public Integer saveEmployee(Employee e) {
		//util.commonCal(e);
		EmployeeUtil.commonCal(e);
		e = repo.save(e);
		return e.getEmpId();
	}

	
	public void updateEmployee(Employee e) {
		//util.commonCal(e);
		EmployeeUtil.commonCal(e);
		   repo.save(e);
		
	}

	
	public void deleteEmployee(Integer id) {
		
	/*Optional<Employee> opt = repo.findById(id);
	if(opt.isPresent()) {
		repo.deleteById(id);
	  }else {
		  throw new EmployeeNotFoundException("EMPLOYEE NOT FOUND WITH ID : " +id);
	  }*/
	
	 /*repo.delete(
			repo.findById(id)
			.orElseThrow(
					()->new EmployeeNotFoundException("EMPLOYEE '"+id+"' NOT FOUND"))
			);*/
	  repo.delete(this.getOneEmployee(id));
	}

	
	public Employee getOneEmployee(Integer id) {
	  /*  Optional<Employee> opt = repo.findById(id);
		return opt.get();*/
		
		return repo.findById(id)
		.orElseThrow(
				()->new EmployeeNotFoundException("EMPLOYEE '"+id+"' NOT FOUND")
		);
	}

	
	public List<Employee> getAllEmployees() {
		List<Employee> list = repo.findAll();
		return list;
	}



}
