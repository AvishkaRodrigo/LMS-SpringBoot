package com.springboot.LMS_Backend.Service;

import com.springboot.LMS_Backend.model.Course;

import java.util.List;
import java.util.Optional;

public interface CourseService{

    Course saveCourse(Course course);

    Optional<Course> getSpecificCourse(int id);

    Course updateCourse(Course course);
    List<Course> getAllCourses();

    List<Course> getAllCoursesOfStudent(int id);

    List<Course> getAvailableCourses(int id);


}
