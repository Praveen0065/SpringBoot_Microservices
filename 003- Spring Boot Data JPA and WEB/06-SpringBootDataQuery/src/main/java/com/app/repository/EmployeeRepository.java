package com.app.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.app.Entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
	      
	     //@Query("_______________")
	     //ReturnType absatrctMethodName(<Param>)
	
	
	     //SQL : 1. fetch one column data
	     @Query("SELECT e.empName FROM Employee e")
	     List<String> getAllEmpNames();
	     
	     
	     //SQL: 2 select all columns
	 	@Query("SELECT e FROM Employee e")
	 	//@Query("FROM Employee e")
	 	List<Employee> fetchAllEmps();
	 	
	 	//SQL : 3 select multiple columns
	 	@Query("SELECT e.empId,e.empName FROM Employee e")
	 	List<Object[]> fetchIdAndNames();
	 	
		//SQL:4 Fetch one column and one row data
		@Query("SELECT e.empName FROM Employee e WHERE e.empId=:id")
		Optional<String> getEmpNameById(Integer id);
	     
		
		//SQL:5 fetch all columns and one row
		@Query("SELECT e FROM Employee e WHERE e.empId=:id")
		Optional<Employee> fetchEmployeeById(Integer id);

}
