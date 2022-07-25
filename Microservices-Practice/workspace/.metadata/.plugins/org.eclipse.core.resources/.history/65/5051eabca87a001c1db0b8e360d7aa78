package com.microservicepractice.departmentservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.microservicepractice.departmentservice.entity.Department;
import com.microservicepractice.departmentservice.service.DepartmentService;

@RestController
@RequestMapping("/departments")
public class DepartmentController {

	@Autowired
	DepartmentService departmentService;
	
	@PostMapping("/")
	public Department saveDepartment(@RequestBody Department department){
		return departmentService.saveDepartment(department);
	}
	
	@GetMapping("/getDeptByCode/{departmentCode}")
	@Cacheable(value = "departmentCache", key="#departmentCode")
	public Department getDepartmentByCode(@PathVariable("departmentCode") String departmentCode){
		return departmentService.getDepartmentByCode(departmentCode);
	}
}
