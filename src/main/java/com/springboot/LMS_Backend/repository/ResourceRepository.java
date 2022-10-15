package com.springboot.LMS_Backend.repository;

import com.springboot.LMS_Backend.model.Resource;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ResourceRepository extends JpaRepository<Resource, Integer> {
    @Query(value = "SELECT * FROM resource WHERE course_id = :courseID",nativeQuery = true)
    List<Resource> findAllResourcesOfCourse(@Param("courseID")int courseID);

    @Query(value = "DELETE FROM resource WHERE resourceid = :resourceID",nativeQuery = true)
    void  deleteResource(@Param("resourceID")int resourceID);
}
