package com.swp.SWP_DCMS.controller;

import com.swp.SWP_DCMS.model.Student;
import com.swp.SWP_DCMS.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class testController {
    @Autowired
    StudentRepository studentRepository;
    @GetMapping(value = "test")
    public List<Student> test() {
        return studentRepository.findAll();
    }
}
