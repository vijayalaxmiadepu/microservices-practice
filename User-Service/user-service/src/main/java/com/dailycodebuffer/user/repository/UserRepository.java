package com.dailycodebuffer.user.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.dailycodebuffer.user.entity.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{

	User findByUserId(String userId);
}
