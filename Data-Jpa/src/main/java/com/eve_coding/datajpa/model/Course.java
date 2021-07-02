package com.eve_coding.datajpa.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String courseName;

    private String courseDescription;

    private LocalDateTime courseDate;

    private double price;

    @ManyToMany(mappedBy = "courseList")
    private List<Student> studentList;

    @OneToMany
    private List<Topic> topicList;
}
