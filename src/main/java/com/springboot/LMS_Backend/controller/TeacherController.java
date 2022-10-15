package com.springboot.LMS_Backend.controller;

import com.springboot.LMS_Backend.Service.TeacherService;
import com.springboot.LMS_Backend.model.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/teacher")
@CrossOrigin
public class TeacherController {

//    @Autowired
//    private Teacher teacher;
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

    @GetMapping("/{id}")
    public ResponseEntity<Teacher> getTeacherById(@PathVariable Integer id){
        try {
            Teacher teacher = teacherService.getTeacherById(id);
            return new ResponseEntity<>(teacher, HttpStatus.OK);
        } catch (NoSuchElementException e){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

//    @PutMapping("/{id}")
//    public ResponseEntity<Teacher> updateTeacher(@RequestBody Teacher teacher, @PathVariable Integer id){
//        try{
//            Teacher existingTeacher = teacherService.getTeacherById(id);
//            teacherService.saveTeacher(existingTeacher);
//            return new ResponseEntity<>(HttpStatus.OK);
//        } catch (NoSuchElementException e){
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }
//    }

    @DeleteMapping("/{id}")
    public String deleteTeacher(@PathVariable Integer id){
        teacherService.deleteTeacher(id);
        return "Teacher info with id "+ id + " has deleted!";
    }

//    @PutMapping("/{teacher_id}/course/{course_id}")
//    public Teacher assignCourseToTeacher(
//            @PathVariable Integer teacher_id,
//            @PathVariable Integer course_id
//    ){
//        return teacherService.assignProjectToTeacher(teacher_id,course_id);
//    }
}
