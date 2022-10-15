package com.springboot.LMS_Backend.repository;

import com.springboot.LMS_Backend.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
        @Query(value = "INSERT INTO `student_course`(`student_id`, `course_id`) VALUES (:studentID,:courseID)",nativeQuery = true)
        void enrollToCourse(@Param("studentID")int studentID,@Param("courseID")int courseID);
}
