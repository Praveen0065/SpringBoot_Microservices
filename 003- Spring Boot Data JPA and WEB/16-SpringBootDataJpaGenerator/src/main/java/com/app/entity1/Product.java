package com.app.entity1;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="product_IdGenerator")
public class Product {
	
	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	@GeneratedValue(generator = "test")
	@GenericGenerator(name = "test", strategy  = "com.app.gen4.MyCustomGen")
	@Column(name = "pid")
	private String proId;
	
	@Column(name="pname")
	private String prodName;
	
	@Column(name = "pcost")
	private Double prodCost;
		

}
