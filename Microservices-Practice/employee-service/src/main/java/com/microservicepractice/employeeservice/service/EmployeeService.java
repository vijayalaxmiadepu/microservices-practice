package com.microservicepractice.employeeservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.microservicepractice.employeeservice.dto.Department;
import com.microservicepractice.employeeservice.entity.Employee;
import com.microservicepractice.employeeservice.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	@Autowired
	RestTemplate restTemplate;
	

	public Employee saveEmployee(Employee employee, String deptCode) {
		Department department = restTemplate.getForObject("http://DEPARTMENT-SERVICE/departments/getDeptByCode/"+deptCode, Department.class);
		if(department != null) {
			return employeeRepository.save(new Employee(employee.getEmpCode(), employee.getEmpName(), employee.getEmpAddress(), department.getId()));
		}
		return null;
	}

	public Employee getEmployeeDetailsByCode(String empCode) {
		return employeeRepository.findByEmpCode(empCode);
	}

}
