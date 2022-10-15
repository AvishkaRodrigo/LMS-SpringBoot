package com.springboot.LMS_Backend.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String fName;
    private String lName;

    public Set<Course> getCourses() {
        return courses;
    }

    public Teacher(int id, String fName, String lName, String email, Set<Course> courses) {
        this.id = id;
        this.fName = fName;
        this.lName = lName;
        this.email = email;
        this.courses = courses;
    }

    public void setCourses(Set<Course> courses) {
        this.courses = courses;
    }

    private String email;

    @OneToMany(mappedBy = "teacher", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private Set<Course> courses;
    public Teacher() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}


