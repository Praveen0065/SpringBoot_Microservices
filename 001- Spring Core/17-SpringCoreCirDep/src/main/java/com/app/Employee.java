package com.app;

public class Employee {
	
	private String name;
	
	private Project pcode;
	
	public Employee() {
		System.out.println("EMPLOYEE OBJ");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Project getPcode() {
		return pcode;
	}

	public void setPcode(Project pcode) {
		this.pcode = pcode;
		System.out.println("EMPLOYEE.setProject");
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", pcode=" + pcode + "]";
	}

	
	
	
	

}
