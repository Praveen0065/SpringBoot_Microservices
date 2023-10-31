package com.app.entity1;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="student_tab")
public class Student {
	
	@Id
	@Column(name ="stud_ID")
	private Integer stdId;
	
	@Column(name="stud_Name")
	private String stdName;
	
	@Column(name="stud_Fee")
	private Double stdFee;

}
