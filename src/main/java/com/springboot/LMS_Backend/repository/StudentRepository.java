package com.springboot.LMS_Backend.repository;

import com.springboot.LMS_Backend.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
    @Query(
            value = "SELECT * FROM student WHERE password = :password AND email = :email ",
            nativeQuery = true)
    Optional<Student> login(@Param("password") String password, @Param("email") String email);
}
