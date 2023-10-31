package com.app.entity;

import java.util.Date;

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
@Entity
@Table(name = "STUDENT_TABLE")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //mysql (Auto increment)
	@Column(name="sid")
	private Integer stdId;
	
	@Column(name="sName")
	private String stdName;
	
	@Column(name="sFee")
	private Double stdFee;
	
	
	@Column(name="sdoj")
	@Temporal(TemporalType.DATE)//stores only date
	//@Temporal(TemporalType.TIME)//stores only time
	//Temporal(TemporalType.TIMESTAMP)//stores both and time (default)
	private Date stdDoj;

}
