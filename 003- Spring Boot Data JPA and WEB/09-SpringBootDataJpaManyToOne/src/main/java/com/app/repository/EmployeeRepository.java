package com.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.entity.Department1;
import com.app.entity.Employee2;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee2, Integer> {
	
	//public List<Employee2> findBydob(Department1 dep);
	

}
