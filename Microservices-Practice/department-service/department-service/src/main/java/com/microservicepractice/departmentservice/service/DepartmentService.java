package com.microservicepractice.departmentservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservicepractice.departmentservice.entity.Department;
import com.microservicepractice.departmentservice.repository.DepartmentRepository;

@Service
public class DepartmentService {
	
	@Autowired
	DepartmentRepository departmentRepository;

	public Department saveDepartment(Department department) {
		return departmentRepository.save(department);
	}

	public Department getDepartmentByCode(String departmentCode) {
		return departmentRepository.findByDeptCode(departmentCode);
	}

}
