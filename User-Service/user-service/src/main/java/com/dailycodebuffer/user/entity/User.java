package com.dailycodebuffer.user.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "user")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

	@Id
    private String userId;
    private String firstName;
    private String lastName;
    private String email;
    private String departmentId;
}
