package com.exel.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exel.demo.constant.EmployeeConstant;
import com.exel.demo.dto.EmployeeDto;
import com.exel.demo.entity.Employee;
import com.exel.demo.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
@Autowired
private EmployeeRepository employeeRepository;

	@Override
	public EmployeeDto addEmployee(EmployeeDto dto) {
		Employee employee = Employee.builder().firstName(dto.getFirstName()).lastName(dto.getLastName())
				.aadharNo(dto.getAadharNo()).mobileNo(dto.getMobileNo()).panNo(dto.getPanNo())
				.employeeNo(dto.getEmployeeNo()).build();

		Employee save =employeeRepository.save(employee);

		return EmployeeDto.builder().id(save.getId()).aadharNo(save.getAadharNo()).panNo(save.getPanNo())
				.mobileNo(save.getMobileNo()).employeeNo(save.getEmployeeNo()).lastName(save.getLastName())
				.firstName(save.getFirstName()).build();
	}
	@Override
	public void deleteEmployee(Employee dto) {
		Optional<Employee> optional = employeeRepository.findAllById(dto.getId());
		if(optional.isPresent())
			employeeRepository.delete(optional.get());
		else
			throw new EmployeeNotFoundException(EmployeeConstant.EMPLOYEE_DELETED_SUCCESS);
	}
	@Override
	public List<EmployeeDto> getAllEmployee(){
		
		 return employeeRepository.findAll().stream()
				 .map(e -> EmployeeDto.builder().id(e.getId()).aadharNo(e.getAadharNo()).firstName(e.getFirstName()).lastName(e.getLastName()).panNo(e.getPanNo()).build()).toList();
	}
}