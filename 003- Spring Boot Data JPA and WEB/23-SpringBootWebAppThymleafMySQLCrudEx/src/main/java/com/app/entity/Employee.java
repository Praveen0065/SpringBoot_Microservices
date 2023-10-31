package com.app.entity;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;

@Data
@Table(name = "EmployeeTabel")
@Entity
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "eId")
	private Integer empId;
	
	@Column(name = "eName")
	private String empName;
	
	@Column(name = "eSal")
	private Double empSal;
	
	@Column(name = "eHra")
	private Double empHra;
	
	@Column(name = "eTa")
	private Double empTa;
	
	@Column(name = "eDept")
	private String empDept;
	
	@Column(name ="eaddr")
	private String empAddr;
	
	@Column(name ="egen")
	private String empGen;
	
	@DateTimeFormat(pattern = "yyyy-mm-dd")
	@Temporal(TemporalType.DATE)
	@Column(name ="edate")
	private Date empDate;

}
