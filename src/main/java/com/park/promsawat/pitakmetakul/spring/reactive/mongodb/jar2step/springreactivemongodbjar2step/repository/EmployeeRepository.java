package com.park.promsawat.pitakmetakul.spring.reactive.mongodb.jar2step.springreactivemongodbjar2step.repository;

import com.park.promsawat.pitakmetakul.spring.reactive.mongodb.jar2step.springreactivemongodbjar2step.model.Employee;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface EmployeeRepository extends ReactiveMongoRepository<Employee,String> {
}
