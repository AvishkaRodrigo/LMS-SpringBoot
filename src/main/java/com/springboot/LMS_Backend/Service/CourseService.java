package com.springboot.LMS_Backend.Service;

import com.springboot.LMS_Backend.model.Course;
import com.springboot.LMS_Backend.model.Student;

import java.util.List;

public interface CourseService{

    Course saveCourse(Course course);

    Course updateCourse(Course course);
    List<Course> getAllCourses();

    List<Course> getAllCoursesOfStudent(Student student);


}
