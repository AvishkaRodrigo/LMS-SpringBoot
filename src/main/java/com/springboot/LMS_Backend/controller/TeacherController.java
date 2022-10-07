package com.springboot.LMS_Backend.controller;

import com.springboot.LMS_Backend.Service.TeacherService;
import com.springboot.LMS_Backend.model.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/teacher")
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    @PostMapping("/add")
    public String add(@RequestBody Teacher teacher){
        teacherService.saveTeacher(teacher);
        return "new teacher added!";
    }

}
