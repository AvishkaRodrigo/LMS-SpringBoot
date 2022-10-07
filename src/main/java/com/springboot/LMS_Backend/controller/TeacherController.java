package com.springboot.LMS_Backend.controller;

import com.springboot.LMS_Backend.Service.TeacherService;
import com.springboot.LMS_Backend.model.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/teacher")
@CrossOrigin
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    @PostMapping("/add")
    public String add(@RequestBody Teacher teacher){
        teacherService.saveTeacher(teacher);
        return "new teacher added!";
    }

    @GetMapping("/teachers")
    public List<Teacher> getAllTeachers(){
        return teacherService.getAllteachers();
    }
}
