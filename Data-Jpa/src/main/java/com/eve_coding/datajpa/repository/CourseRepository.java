package com.eve_coding.datajpa.repository;

import com.eve_coding.datajpa.model.Course;
import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course,Long> {
}
