package com.springboot.LMS_Backend.controller;


import com.springboot.LMS_Backend.Service.CourseService;
import com.springboot.LMS_Backend.model.Course;

import com.springboot.LMS_Backend.model.Teacher;

import com.springboot.LMS_Backend.model.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

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

    @GetMapping("/{id}")
    @ResponseBody
    public Optional<Course> getOne(@PathVariable int id){

        return courseService.getSpecificCourse(id);
    }
    @PostMapping("/add")
    public HashMap<String, String> add(@RequestBody Course course){
        courseService.saveCourse(course);
        HashMap<String, String> map = new HashMap<>();
        map.put("message","OK");
        return map;
    }
//    @PostMapping("/update")
//    public HashMap<String, String> update(@RequestBody Course course){
//        courseService.updateCourse(course);
//        HashMap<String, String> map = new HashMap<>();
//        map.put("message","OK");
//        return map;
//    }





}
