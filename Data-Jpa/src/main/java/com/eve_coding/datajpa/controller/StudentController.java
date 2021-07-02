package com.eve_coding.datajpa.controller;

import com.eve_coding.datajpa.model.Student;
import com.eve_coding.datajpa.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "/student/save",method = RequestMethod.POST)
    public void saveStudent(@RequestBody Student student){
        studentService.save(student);
    }
}
