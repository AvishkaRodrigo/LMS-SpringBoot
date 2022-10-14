package com.springboot.LMS_Backend.Service;

import com.springboot.LMS_Backend.model.Student;

import java.util.List;

public interface StudentService {
    Student saveStudent(Student student);

    List<Student> getAllStudents();
}
