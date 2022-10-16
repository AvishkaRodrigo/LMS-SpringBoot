package com.springboot.LMS_Backend.controller;

import com.springboot.LMS_Backend.Service.CourseService;
import com.springboot.LMS_Backend.Service.StudentService;
import com.springboot.LMS_Backend.model.Course;
import com.springboot.LMS_Backend.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/student")
@CrossOrigin
public class StudentController {

    @Autowired
    private StudentService studentService;
    @Autowired
    private CourseService courseService;

    @GetMapping("/{id}")
    @ResponseBody
    public Optional<Student> addStudent(@PathVariable int id){
        return studentService.getStudent(id);

    }
    @PostMapping("/add")
    public String add(@RequestBody Student student){
        studentService.saveStudent(student);
        return "new student added!";
    }

    @PostMapping("/login")
    public Optional<Student> login(@RequestBody Map<String, String> json){
        String userName = json.get("userName");
        String password = json.get("password");
        return studentService.login(userName, password);

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

    @GetMapping("/enrolledCourses/{id}")
    @ResponseBody
    public List<Course> enrolled(@PathVariable int id){

        return courseService.getAllCoursesOfStudent(id);
    }

    @GetMapping("/notEnrolledCourses/{id}")
    @ResponseBody
    public List<Course> notEnrolled(@PathVariable int id){

        return courseService.getAvailableCourses(id);
    }
}
