package com.app.entity1;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="product_tab")
public class Product {
	
	@Id
	@Column(name = "pid")
	private Integer proId;
	
	@Column(name="pname")
	private String prodName;
	
	@Column(name = "pcost")
	private Double prodCost;
		

}
