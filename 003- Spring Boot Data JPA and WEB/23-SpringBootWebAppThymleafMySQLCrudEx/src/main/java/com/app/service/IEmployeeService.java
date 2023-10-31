package com.app.service;

import java.awt.print.Pageable;
import java.util.List;

import org.springframework.data.domain.Page;

import com.app.entity.Employee;

public interface IEmployeeService {
	
	    Integer saveEmployee(Employee e);
	    void updateEmployee(Employee e);
	    void deleteEmployee(Integer id);
	    Employee getOneEmployee(Integer id);
	    List<Employee> getAllEmployees();
	   // Page<Employee> getAllEmployees(Pageable pagable);
	     

}
