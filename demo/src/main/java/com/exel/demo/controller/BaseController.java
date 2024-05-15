package com.exel.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.exel.demo.dto.EmployeeDto;
import com.exel.demo.service.EmployeeService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class BaseController {
	
	@Autowired
	private EmployeeService employeeservice;
	@GetMapping("/home")
    public ResponseEntity<String> homeGetReq() {
	return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Hello");
}
	
	@PostMapping("/add")
	   public ResponseEntity<EmployeeDto> addEmployee(@RequestBody EmployeeDto employee) {
	   EmployeeDto dto = employeeservice.addEmployee(employee);
	   return ResponseEntity.status(HttpStatus.OK).body(dto);
	}
	
	@PostMapping("/home/request1")
	   public ResponseEntity<String> homePostReq1(@RequestParam String str) {
	   return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(str);
	}
	@DeleteMapping("/delete")
	public ResponseEntity<String> deleteEmployee(@RequestBody EmployeeDto dto);
	employeeservice.deleteEmployee(dto);
	return ResponseEntity.ok(EmployeeConstant.EMPLOYEE_DELETED_SUCCESS );
	else
		throw new EmployeeNotFoundException(EMPLOYEE_ID_NOT_FOUND);
}
@GetMapping("/getAll")
public ResponseEntity<List<EmployeeDto>> fetchAllEmployees();
return ResponseEntity.ok(employeeService.getAllEmployee());
		
		
		