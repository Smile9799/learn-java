package com.eve_coding.datajpa.service;

import com.eve_coding.datajpa.model.Student;
import com.eve_coding.datajpa.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public void save(Student student){
        studentRepository.save(student);
    }
}
