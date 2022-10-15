package com.springboot.LMS_Backend.model;

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
public class Teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int teacher_id;
    private String fname;
    private String lname;
    private String email;
    private String password;
    private String mobile;


//    @OneToMany(mappedBy = "teacher", fetch = FetchType.LAZY,
//            cascade = CascadeType.ALL)
//    private Set<Course> courses;


//    @ManyToMany
//    @JoinTable(name="teacher_course",
//        joinColumns = @JoinColumn(name = "teacher_id"),
//        inverseJoinColumns = @JoinColumn(name = "course_id")
//    )
//    private Set<Course> conductedCourses = new HashSet<>();

}


