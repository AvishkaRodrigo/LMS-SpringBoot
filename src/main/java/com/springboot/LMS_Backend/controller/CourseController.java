package com.springboot.LMS_Backend.controller;


import com.springboot.LMS_Backend.Service.CourseService;
import com.springboot.LMS_Backend.model.Course;
import com.springboot.LMS_Backend.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/course")
@CrossOrigin
public class CourseController {
    @Autowired
    private CourseService courseService;

    @GetMapping("/all")
    public List<Course> getAll(){
        return courseService.getAllCourses();
    }
    @PostMapping("/add")
    public HashMap<String, String> add(@RequestBody Course course){
        courseService.saveCourse(course);
        HashMap<String, String> map = new HashMap<>();
        map.put("message","OK");
        return map;
    }
    @PostMapping("/update")
    public HashMap<String, String> update(@RequestBody Course course){
        courseService.updateCourse(course);
        HashMap<String, String> map = new HashMap<>();
        map.put("message","OK");
        return map;
    }

    @PostMapping("/enrolledCourses")
    public List<Course> enrolled(@RequestBody Student student){
       return courseService.getAllCoursesOfStudent(student);
    }


}
