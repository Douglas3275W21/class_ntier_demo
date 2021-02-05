package com.example.class_demo_project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@RestController
public class ClassDemoProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClassDemoProjectApplication.class, args);
	}
//	@GetMapping
//	public String hello(){
//		return "Hello World";
//	}

//	@GetMapping
//	public List<String> hello(){
//		return List.of("Hello" , "World");
//	}

//	@GetMapping
//	public List<Student> hello(){
//		return List.of(
//				new Student (
//						1L,
//						"John",
//						"Joh.Doe@gmail.com",
//						LocalDate.of(2000, Month.JANUARY,5),
//						21
//						)
//		);
//	}
}
