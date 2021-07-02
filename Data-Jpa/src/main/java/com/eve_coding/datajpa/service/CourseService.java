package com.eve_coding.datajpa.service;

import com.eve_coding.datajpa.model.Course;
import com.eve_coding.datajpa.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    public void save(Course course){
        courseRepository.save(course);
    }
}
