package com.app.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// child class

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name ="onetoMany_ModelTable")
public class Model1 {
	
	@Id
	@Column(name ="mid")
	private Integer modelId;
	
	@Column(name ="mcode")
	private String modelCode;
	
	@Column(name ="mdata")
	private String modelData;
	

}
