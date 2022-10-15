package com.springboot.LMS_Backend.Service;

import com.springboot.LMS_Backend.model.Teacher;
import com.springboot.LMS_Backend.repository.TeacherRespository;

import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public interface TeacherService {


    public Teacher saveTeacher(Teacher teacher);
    public List<Teacher> getAllteachers();
    public Teacher getTeacherById (Integer id);


    public void deleteTeacher(Integer id);

//    public Teacher assignProjectToTeacher(Integer teacher_id, Integer course_id);
}
