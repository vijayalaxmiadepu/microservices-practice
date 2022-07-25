package com.microservicepractice.employeeservice.entity;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "employee")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
	
	@Id
	private String id;
	private String empCode;
	private String empName;
	private String empAddress;
	private String deptId;
	private LocalDateTime createdAt;
	
	public Employee(String empCode, String empName, String empAddress, String deptId) {
		super();
		this.empCode = empCode;
		this.empName = empName;
		this.empAddress = empAddress;
		this.deptId = deptId;
		this.createdAt = LocalDateTime.now();
	}

}
