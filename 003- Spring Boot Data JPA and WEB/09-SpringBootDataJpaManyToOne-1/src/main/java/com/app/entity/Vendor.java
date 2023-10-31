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
@Table(name = "test_Vendor")
public class Vendor {
	
	@Id
	@Column(name ="vid")
	private Integer venId;
	
	@Column(name ="vname")
	private String venName;
	
	@Column(name = "pcity")
	private String venCity;
	

}
