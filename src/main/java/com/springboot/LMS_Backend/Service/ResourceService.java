package com.springboot.LMS_Backend.Service;

import com.springboot.LMS_Backend.model.Resource;

import java.util.List;

public interface ResourceService {

    Resource saveResource(Resource resource);

    List<Resource> getAllResources();

    void deleteResource(int id);

    Resource saveResourceToCourse(int resourceID,int courseID);
}
