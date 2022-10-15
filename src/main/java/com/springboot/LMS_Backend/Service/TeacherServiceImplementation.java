package com.springboot.LMS_Backend.Service;

import com.springboot.LMS_Backend.model.Course;
import com.springboot.LMS_Backend.model.Teacher;
import com.springboot.LMS_Backend.repository.CourseRepository;
import com.springboot.LMS_Backend.repository.TeacherRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class TeacherServiceImplementation implements TeacherService {

    @Autowired
    private TeacherRespository teacherRespository;

    @Autowired
    private CourseRepository courseRepository;

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

//    @Override
//    public Teacher assignProjectToTeacher(Integer teacher_id, Integer course_id) {
//        Set<Course> courseSet = null;
//        Teacher teacher = teacherRespository.findById(teacher_id).get();
//        Course course = courseRepository.findById(course_id).get();
//        courseSet = teacher.getConductedCourses();
//        courseSet.add(course);
//        teacher.setConductedCourses(courseSet);
//        return teacherRespository.save(teacher);
//    }
}
