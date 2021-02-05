package com.example.class_demo_project.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.JANUARY;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository repository) {
        return args -> {
            Student john = new Student(
                    1L,
                    "John",
                    "John.Doe@gmail.com",
                    LocalDate.of(2000, JANUARY, 5),
                    21
            );
            Student alex = new Student(
//                    1L, removed as it is auto generated
                    "Alex",
                    "alex@gmail.com",
                    LocalDate.of(2000, JANUARY, 5),
                    21
            );

            repository.saveAll(
                    List.of(john, alex)
            );

        };
    }
}
