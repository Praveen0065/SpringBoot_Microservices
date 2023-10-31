package com.app.entity1;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "Employe")
public class Employee {
	
	@Id
	@Column(name = "eId")
	private Integer empId;
	
	@Column(name = "eName")
	private String empName;
	
	@Column(name = "eSal")
	private Double empSal;
	
	@Column(name = "eDept")
	private String empDept;
	
	
	

}
