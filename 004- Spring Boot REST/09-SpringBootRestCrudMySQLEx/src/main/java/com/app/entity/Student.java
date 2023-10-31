package com.app.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "table_student")
@Entity
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "sid")
	private Integer stdId;
	
	@Column(name = "sname")
	//@NotNull(message = "Name Cannot Be null")
	//@NotEmpty(message = "STUDENT NAME CANNOT BE EMPTY")
	@NotBlank(message =  "STUDENT NAME CANNOT BE BLANK")
	@Size(min = 2,max = 7,message = "NAME MUST BE 2-7 CHARS ONLY")
	@Pattern(regexp = "[A-Za-z]{2,7}",message = "Only chars are allowed")
	private String stdName;
	
	@Column(name = "sgen")
	@NotBlank(message="STUDENT GENDER CAN NOT BE EMPTY")
	private String stdGen;
	
	@Column(name="scourse")
	@NotBlank(message="STUDENT COURSE MUST BE SELECTED")
	private String stdCourse;
	
	@Column(name = "saddr")
	@Pattern(regexp = "[A-Za-z0-9\\.\\-\\?]{10,250}",message = "INVALID ADDRESS DETAILS")
	private String stdAddr;

}
