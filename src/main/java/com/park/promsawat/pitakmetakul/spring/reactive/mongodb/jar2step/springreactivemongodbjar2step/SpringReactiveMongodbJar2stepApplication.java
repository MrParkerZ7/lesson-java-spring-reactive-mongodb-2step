package com.park.promsawat.pitakmetakul.spring.reactive.mongodb.jar2step.springreactivemongodbjar2step;

import com.park.promsawat.pitakmetakul.spring.reactive.mongodb.jar2step.springreactivemongodbjar2step.model.Employee;
import com.park.promsawat.pitakmetakul.spring.reactive.mongodb.jar2step.springreactivemongodbjar2step.repository.EmployeeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.UUID;
import java.util.stream.Stream;

@SpringBootApplication
public class SpringReactiveMongodbJar2stepApplication {

    @Bean
    CommandLineRunner employee(EmployeeRepository employeeRepository) {

        return args -> {
            employeeRepository.deleteAll().subscribe(null, null, () -> {
                Stream.of(
                        new Employee(UUID.randomUUID().toString(), "Park", 3_000L),
                        new Employee(UUID.randomUUID().toString(), "Mark", 345_000L),
                        new Employee(UUID.randomUUID().toString(), "Fark", 45_000L),
                        new Employee(UUID.randomUUID().toString(), "Fuck", 141_000L),
                        new Employee(UUID.randomUUID().toString(), "Muck", 345_000L)
                ).forEach(employee -> {
                    employeeRepository
                            .save(employee)
                            .subscribe(System.out::println);
                });
            });
        };
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringReactiveMongodbJar2stepApplication.class, args);
    }
}
