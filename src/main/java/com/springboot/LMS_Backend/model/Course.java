package com.springboot.LMS_Backend.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int courseID;
    private String courseName;
    private String description;


    @ManyToOne(fetch = FetchType.LAZY, optional = true)
    @JoinColumn(name = "teacher_id", nullable = true)
    private Teacher teacher;

    @OneToMany(mappedBy = "course")
    private Set<Resource> resources = new HashSet<>();

    @JsonIgnore
    @ManyToMany(mappedBy = "courses")
//    private Set<Student> students;

//     @JsonIgnore
//     @ManyToMany(mappedBy = "conductedCourses")
//     private Set<Teacher> teacherSet = new HashSet<>();

    Set<Student> students = new HashSet<>();


}
