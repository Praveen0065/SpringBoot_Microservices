package com.app.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// parent class 
// Product HAS A models

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name ="OnetoMany_ProductTable")
public class Product2 {
	
	@Id
	@Column(name="pid")
	private Integer prodId;
	
	@Column(name ="pcode")
	private String prodCode;
	
	@OneToMany
	@JoinColumn(name ="midFK")
	private List<Model1> mobs;

}
