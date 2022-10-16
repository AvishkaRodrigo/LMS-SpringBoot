package com.springboot.LMS_Backend.Service;

import com.springboot.LMS_Backend.model.Course;
import com.springboot.LMS_Backend.model.Student;
import com.springboot.LMS_Backend.repository.CourseRepository;
import com.springboot.LMS_Backend.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImplementation implements StudentService {
    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private CourseRepository courseRepository;

    @Override
    public Student saveStudent(Student student){
        return studentRepository.save(student);
    }

    @Override
    public Optional<Student> getStudent(int id) {
        return studentRepository.findById(id);
    }

    @Override
    public Optional<Student> login(String userName, String Password) {
        return studentRepository.login(Password, userName);
    }

    @Override
    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }


    @Override
    public Course enrollInCourse(int studentID,int courseID) {
          Student student =  studentRepository.findById(studentID).get();
          Course course =  courseRepository.findById(courseID).get();
          student.getCourses().add(course);
          return courseRepository.save(course);
    }
}
