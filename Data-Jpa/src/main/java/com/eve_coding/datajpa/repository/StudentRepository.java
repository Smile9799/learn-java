package com.eve_coding.datajpa.repository;

import com.eve_coding.datajpa.model.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student,Long> {
}
