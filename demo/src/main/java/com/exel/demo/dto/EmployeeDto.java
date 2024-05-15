package com.exel.demo.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EmployeeDto {

	@Id
	private Integer id;
	private String firstName;
	private String lastName;
	private String mobileNo;
	private String aadharNo;
	private String panNo;
	private String employeeNo;

 }

