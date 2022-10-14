package com.springboot.LMS_Backend.Service;

import com.springboot.LMS_Backend.model.Teacher;

import java.util.List;

public interface TeacherService {

    public Teacher saveTeacher(Teacher teacher);
    public List<Teacher> getAllteachers();

}
