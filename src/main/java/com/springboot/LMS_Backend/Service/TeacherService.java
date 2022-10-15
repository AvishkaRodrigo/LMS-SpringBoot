package com.springboot.LMS_Backend.Service;

import com.springboot.LMS_Backend.model.Teacher;
import com.springboot.LMS_Backend.repository.TeacherRespository;

import java.util.List;

public interface TeacherService {

    public Teacher saveTeacher(Teacher teacher);
    public List<Teacher> getAllteachers();
    public Teacher getTeacherById (Integer id);

    public void deleteTeacher(Integer id);
}
