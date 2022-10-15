package com.springboot.LMS_Backend.Service;

import com.springboot.LMS_Backend.model.Course;
import com.springboot.LMS_Backend.model.Student;
import com.springboot.LMS_Backend.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImplementation implements CourseService{
    @Autowired
    private CourseRepository repository;
    @Override
    public Course saveCourse(Course course) {
        return repository.save(course);
    }

    @Override
    public Course updateCourse(Course course) {

        return repository.save(course);
    }

    @Override
    public List<Course> getAllCourses() {
        return repository.findAll();
    }

    @Override
    public List<Course> getAllCoursesOfStudent(Student student) {
        return repository.findAll();
    }
}
