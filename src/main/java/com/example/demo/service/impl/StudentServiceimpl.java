package com.example.demo.service.impl;

import org.springframework.stereotype.Service;
import com.example.demo.repository.StudentRepo;

@Service
public class StudentServiceimpl {

    private final StudentRepo studentRepo;

    public StudentServiceimpl(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }
}
