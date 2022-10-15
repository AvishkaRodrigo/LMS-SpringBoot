package com.springboot.LMS_Backend.Service;

import com.springboot.LMS_Backend.model.Course;

import java.util.List;

public interface CourseService{

    Course saveCourse(Course course);

    List<Course> getAllCourses();


}
