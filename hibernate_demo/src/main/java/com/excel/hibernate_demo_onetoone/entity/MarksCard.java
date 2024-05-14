package com.excel.hibernate_demo_onetoone.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
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
@Table(name="marks")

public class MarksCard {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="marks_id")
	private int id;
	 
	@Column(name="grade")
    private String grade;
     
	@Column(name="marks")
    private double marks;
	
	@OneToOne(cascade = CascadeType.ALL )
	private MarksCard markscard;
}
