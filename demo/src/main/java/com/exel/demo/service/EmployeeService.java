package com.exel.demo.service;

import java.util.List;

import com.exel.demo.dto.EmployeeDto;
import com.exel.demo.entity.Employee;

public interface EmployeeService {
	
public EmployeeDto addEmployee(EmployeeDto dto);

List<EmployeeDto> getAllEmployee();

void deleteEmployee(Employee dto);
}
