package com.app.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name ="OneToOne_user")
public class User {

	@Id
	@Column(name="uid")
	private Integer userId;
	
	@Column(name ="uname")
	private String name;
	
	@OneToOne
	@JoinColumn(name ="ridFk")
	private Role rol;
	
	
	
}
