package com.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.app.entity.Department1;
import com.app.entity.Employee2;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee2, Integer> {
	
	//public List<Employee2> findBydob(Department1 dep);
	
	
	// INNER JOIN-----------------------------
	@Query("SELECT emp.empName, dept.deptName FROM Employee2 emp INNER JOIN emp.dob as dept")
	List<Object[]> getEnameDeptNames();
	
	// LEFT OUTER JOIN--------------------------
	//@Query("SELECT emp.empName, dept.deptName FROM Employee2 emp LEFT OUTER JOIN emp.dob as dept")
	@Query("SELECT emp.empName, dept.deptName FROM Employee2 emp LEFT OUTER JOIN emp.dob as dept WHERE dept IS NULL")
	List<Object[]> getAllEnameAndDeptNamesIfExist();
	
	// RIGHT OUTER JOIN--------------------------
   // @Query("SELECT emp.empName, dept.deptName FROM Employee2 emp RIGHT OUTER JOIN emp.dob as dept ")
	@Query("SELECT emp.empName, dept.deptName FROM Employee2 emp RIGHT OUTER JOIN emp.dob as dept WHERE emp IS NULL")
    List<Object[]> getAllDeptsAndENamesIfExist();
	
    
    // FULL JOIN---------------------
    @Query("SELECT emp.empName,dept.deptName FROM Employee2 emp FULL JOIN emp.dob as dept")
    List<Object[]> getAllData();
    
    
    
	@Query("SELECT emp.empName, dept.deptName FROM Employee2 emp INNER JOIN emp.dob as dept WHERE dept.deptName=:deptName")
	List<Object[]> getEnameDeptNames(String deptName);

}
