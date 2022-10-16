package com.springboot.LMS_Backend.repository;

import com.springboot.LMS_Backend.model.Course;
import com.springboot.LMS_Backend.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CourseRepository extends JpaRepository<Course, Integer> {
    @Query(
            value = "SELECT * FROM course WHERE course.courseid IN (SELECT student_course.course_id FROM student_course WHERE student_course.student_id = :studentID)",
            nativeQuery = true)
    List<Course> getStudentCourses(@Param("studentID") int studentID);

    @Query(
            value = "SELECT * FROM course WHERE course.courseid NOT IN (SELECT student_course.course_id FROM student_course WHERE student_course.student_id = :studentID)",
            nativeQuery = true)
    List<Course> getNotEnrolledCourses(@Param("studentID") int studentID);
}
