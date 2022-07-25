package com.microservicepractice.employeeservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.microservicepractice.employeeservice.entity.Employee;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee, String>{

	Employee findByEmpCode(String empCode);
}
