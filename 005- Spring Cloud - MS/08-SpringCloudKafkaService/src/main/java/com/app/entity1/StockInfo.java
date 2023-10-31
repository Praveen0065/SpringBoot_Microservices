package com.app.entity1;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "stockTable")
@Entity
public class StockInfo {	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="sid")
	private Integer stkId;
	
	@Column(name = "scode")
	private String stkCode;
	
	@Column(name = "scost")
	private Double  stkCost;

}
