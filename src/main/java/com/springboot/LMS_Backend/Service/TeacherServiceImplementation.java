package com.springboot.LMS_Backend.Service;

import com.springboot.LMS_Backend.model.Teacher;
import com.springboot.LMS_Backend.repository.TeacherRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeacherServiceImplementation implements TeacherService {

    @Autowired
    private TeacherRespository teacherRespository;

    @Override
    public Teacher saveTeacher(Teacher teacher) {
        return teacherRespository.save(teacher);
    }
}
