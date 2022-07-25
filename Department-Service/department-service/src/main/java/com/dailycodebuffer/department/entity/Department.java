package com.dailycodebuffer.department.entity;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "department")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Department {
	@Id
    private String departmentId;
    private String departmentName;
    private String departmentAddress;
    private String departmentCode;
}
