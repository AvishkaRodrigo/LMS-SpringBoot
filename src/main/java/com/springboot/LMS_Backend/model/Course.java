package com.springboot.LMS_Backend.model;

import javax.persistence.*;
import java.util.Set;

@Entity

public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int courseID;
    private String courseName;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "teacher_id", nullable = false)
    private Teacher teacher;

    @OneToMany(mappedBy = "course", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private Set<Resource> resources;



    @ManyToMany(mappedBy = "courses")
    private Set<Student> students;



}
