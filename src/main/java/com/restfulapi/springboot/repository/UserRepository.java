package com.restfulapi.springboot.repository;

import com.restfulapi.springboot.data.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String>
{}