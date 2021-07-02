package com.eve_coding.datajpa.controller;

import com.eve_coding.datajpa.model.Course;
import com.eve_coding.datajpa.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class CourseController {

    @Autowired
    private CourseService courseService;

    @RequestMapping(value = "/courses/save",method = RequestMethod.POST)
    private void saveCourse(@RequestBody Course course){
        course.setCourseDate(LocalDateTime.now());
        courseService.save(course);
    }
}
