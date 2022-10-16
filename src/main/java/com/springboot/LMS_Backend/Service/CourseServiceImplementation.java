package com.springboot.LMS_Backend.Service;

import com.springboot.LMS_Backend.model.Course;
import com.springboot.LMS_Backend.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseServiceImplementation implements CourseService{
    @Autowired
    private CourseRepository repository;
    @Override
    public Course saveCourse(Course course) {
        return repository.save(course);
    }

    @Override
    public Optional<Course> getSpecificCourse(int id) {
        return repository.findById(id);
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
    public List<Course> getAllCoursesOfStudent(int id) {

        return repository.getStudentCourses(id);
    }

    @Override
    public List<Course> getAvailableCourses(int id) {
        return repository.getNotEnrolledCourses(id);
    }
}
