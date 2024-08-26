package com.practice.demo.repository;

import com.practice.demo.entitiy.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmployeeRepository extends MongoRepository<Employee, String> {
}
