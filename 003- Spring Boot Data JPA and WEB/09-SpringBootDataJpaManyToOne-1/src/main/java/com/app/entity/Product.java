package com.app.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "test_Product")
public class Product {
	
	@Id
	@Column(name ="pid")
	private Integer prodId;
	
	@Column(name ="pPrice")
	private double prodPrice;
	
	@Column(name = "pname")
	private String prodName;
	
	@ManyToOne
	@JoinColumn(name = "vidFK")
	private Vendor ven;
	

}
