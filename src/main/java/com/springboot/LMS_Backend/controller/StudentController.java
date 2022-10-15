package com.springboot.LMS_Backend.controller;

import com.springboot.LMS_Backend.Service.StudentService;
import com.springboot.LMS_Backend.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/student")
@CrossOrigin
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/add")
    public String add(@RequestBody Student student){
        studentService.saveStudent(student);
        return "new student added!";
    }

    @GetMapping("/students")
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @PostMapping("/enroll")
    public Map<String, String> getAllStudents(@RequestBody Map<String, Integer> json) {
        studentService.enrollInCourse(json.get("studentID"),json.get("courseID"));
        HashMap<String, String> map = new HashMap<>();
        map.put("message","OK");
        return map;
    }
}
