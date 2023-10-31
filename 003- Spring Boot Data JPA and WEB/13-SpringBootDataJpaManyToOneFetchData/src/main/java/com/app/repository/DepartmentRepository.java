package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.entity.Department1;

@Repository
public interface DepartmentRepository extends JpaRepository<Department1, Integer>{
	
	//public Department1 findByDeptName(String name);
	
	

}
