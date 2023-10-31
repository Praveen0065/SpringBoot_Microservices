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

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name ="oneToMany_Collage")
public class Collage {
	
	@Id
	@Column(name="cid")
	private Integer colId;
	
	@Column(name ="cname")
	private String colName;
	
	@Column(name ="ccode")
	private String colCode;
	
	@OneToMany
	@JoinColumn(name ="bidFK")
	private List<Branches> branch;
	

}
