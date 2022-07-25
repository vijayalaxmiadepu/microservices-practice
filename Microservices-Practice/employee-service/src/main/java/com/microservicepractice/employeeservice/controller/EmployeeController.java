package com.microservicepractice.employeeservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.microservicepractice.employeeservice.entity.Employee;
import com.microservicepractice.employeeservice.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;
	
	@PostMapping("/")
	public Employee saveEmployee(@RequestBody Employee employee, @RequestParam String deptCode) {
		return employeeService.saveEmployee(employee, deptCode);
	}
	
	@GetMapping("/getEmployeeByCode")
	@Cacheable(value = "employeeCache", key = "#empCode")
	public Employee getEmployeeByCode(@RequestParam String empCode) {
		return employeeService.getEmployeeDetailsByCode(empCode);
	}
}
