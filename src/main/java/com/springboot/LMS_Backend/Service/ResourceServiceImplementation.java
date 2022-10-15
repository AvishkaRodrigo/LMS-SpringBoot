package com.springboot.LMS_Backend.Service;

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

    @Override
    public Resource saveResource(Resource resource) {
        return repository.save(resource);
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
