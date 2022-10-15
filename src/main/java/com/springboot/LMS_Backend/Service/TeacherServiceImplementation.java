package com.springboot.LMS_Backend.Service;

import com.springboot.LMS_Backend.model.Teacher;
import com.springboot.LMS_Backend.repository.TeacherRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherServiceImplementation implements TeacherService {

    @Autowired
    private TeacherRespository teacherRespository;

    @Override
    public Teacher saveTeacher(Teacher teacher) {

        return teacherRespository.save(teacher);
    }

    @Override
    public List<Teacher> getAllteachers() {

        return teacherRespository.findAll();
    }

    @Override
    public Teacher getTeacherById(Integer id) {
        return teacherRespository.findById(id).get();
    }

    @Override
    public void deleteTeacher(Integer id) {
        teacherRespository.deleteById(id);
    }
}
