package com.microservicepractice.departmentservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.microservicepractice.departmentservice.entity.Department;

@Repository
public interface DepartmentRepository extends MongoRepository<Department, String>{

	Department findByDeptCode(String deptCode);
}
