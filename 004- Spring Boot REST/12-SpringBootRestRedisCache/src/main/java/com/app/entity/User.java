package com.app.entity;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Redis_user_Table")
public class User implements Serializable {/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private Integer id;
	private String name;
	private String role;

}
