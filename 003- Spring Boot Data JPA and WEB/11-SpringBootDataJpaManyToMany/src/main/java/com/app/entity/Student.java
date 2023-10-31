package com.app.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="ManyToMany_Student")
public class Student {
	@Id
	@Column(name="sid")
	private Integer stdId;
	
	@Column(name="sname")
	private String stdName;
	
	@Column(name="smail")
	private String stdEmail;
	
	@ManyToMany
	@JoinTable(
			name="M_to_M_Student_Course",
			joinColumns = @JoinColumn(name="sidFk"),
			inverseJoinColumns = @JoinColumn(name="cidFk")
			)
	private List<Course> cobs;
	
	
}