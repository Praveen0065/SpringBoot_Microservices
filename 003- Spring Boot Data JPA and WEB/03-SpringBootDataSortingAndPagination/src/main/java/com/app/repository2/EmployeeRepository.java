package com.app.repository2;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.app.entity1.Employee;

public interface EmployeeRepository extends PagingAndSortingRepository<Employee, Integer> {

}
