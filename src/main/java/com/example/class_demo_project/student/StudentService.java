package com.example.class_demo_project.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentService (StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }


    public List<Student> getStudent(){

        return studentRepository.findAll();
//        return List.of(
//                new Student (
//                        1L,
//                        "John",
//                        "Joh.Doe@gmail.com",
//                        LocalDate.of(2000, Month.JANUARY,5),
//                        21
//                )
//        );
    }
}
