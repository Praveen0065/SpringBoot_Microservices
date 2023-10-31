package com.app.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name ="oneToMany_Branches")
public class Branches {
	
	@Id
	@Column(name ="bid")
	private Integer branId;
	
	@Column(name ="bcode")
	private String branCode;
	
	@Column(name ="bname")
	private String branName;
	

}
