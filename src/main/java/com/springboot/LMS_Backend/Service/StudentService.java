package com.springboot.LMS_Backend.Service;

import com.springboot.LMS_Backend.model.Course;
import com.springboot.LMS_Backend.model.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {
    Student saveStudent(Student student);

    Optional<Student> getStudent(int id);

    Optional<Student> login(String userName, String Password);
    List<Student> getAllStudents();

    Course enrollInCourse(int studentID, int courseID);
}
