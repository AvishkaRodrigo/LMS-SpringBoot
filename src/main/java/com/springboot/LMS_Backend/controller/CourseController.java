package com.springboot.LMS_Backend.controller;


import com.springboot.LMS_Backend.Service.CourseService;
import com.springboot.LMS_Backend.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
@RequestMapping("/course")
@CrossOrigin
public class CourseController {
    @Autowired
    private CourseService courseService;

    @PostMapping("/add")
    public HashMap<String, String> add(@RequestBody Course course){
        courseService.saveCourse(course);
        HashMap<String, String> map = new HashMap<>();
        map.put("message","OK");
        return map;
    }


}
