package com.dailycodebuffer.department.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.dailycodebuffer.department.entity.Department;

@Repository
public interface DepartmentRepository extends MongoRepository<Department, String>{

	@Query("{departmentId: ?0}")
	Department findByDepartmentId(String departmentId);

}
