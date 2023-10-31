package com.app;

import org.springframework.stereotype.Component;

import com.app.entity.Employee;

// after java 8 ( static methods and default methods)
//@Component
public interface EmployeeUtil {
	
	  public static void commonCal(Employee e) {
		double hra = e.getEmpSal() * (12.0/100);
		double ta = e.getEmpSal() * (4.0/100);
		e.setEmpHra(hra);
		e.setEmpTa(ta);

	}

}
