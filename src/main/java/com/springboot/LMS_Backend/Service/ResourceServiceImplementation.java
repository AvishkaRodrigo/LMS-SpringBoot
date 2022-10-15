package com.springboot.LMS_Backend.Service;

import com.springboot.LMS_Backend.model.Course;
import com.springboot.LMS_Backend.model.Resource;
import com.springboot.LMS_Backend.repository.CourseRepository;
import com.springboot.LMS_Backend.repository.ResourceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResourceServiceImplementation implements ResourceService{
    @Autowired
    private ResourceRepository repository;

    @Autowired
    private CourseRepository courseRepository;

    @Override
    public Resource saveResource(Resource resource) {
        return repository.save(resource);
    }


    public Resource saveResourceToCourse(int resourceID,int courseID) {
        Course course =  courseRepository.findById(courseID).get();
        Resource resource =  repository.findById(resourceID).get();
        resource.setCourse(course);
        course.getResources().add(resource);
        courseRepository.save(course);
        repository.save(resource);
        return  resource;
    }

    @Override
    public List<Resource> getAllResources() {
        return repository.findAll() ;
    }

    @Override
    public void deleteResource(int id) {
        repository.deleteById(id);
    }


}
