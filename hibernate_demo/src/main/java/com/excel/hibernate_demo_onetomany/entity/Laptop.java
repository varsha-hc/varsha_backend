package com.excel.hibernate_demo_onetomany.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="laptop")



public class Laptop {


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String brand;
	private String serialNo;
	
	@ManyToOne
	(cascade=CascadeType.ALL)
	private Student student;
	

}
