package com.springboot.LMS_Backend.controller;


import com.springboot.LMS_Backend.Service.ResourceService;
import com.springboot.LMS_Backend.model.Course;
import com.springboot.LMS_Backend.model.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/resource")
@CrossOrigin
public class ResourceController {

    @Autowired
    private ResourceService resourceService;

    @GetMapping("/")
    public List<Resource> getAll(){
        return resourceService.getAllResources();
    }
    @PostMapping("/")
    public HashMap<String, String> add(@RequestBody Resource resource){
        resourceService.saveResource(resource);
        HashMap<String, String> map = new HashMap<>();
        map.put("message","OK");
        return map;
    }
    @DeleteMapping("/")
    public HashMap<String, String> delete(@RequestBody Resource resource){

        resourceService.deleteResource(resource.getResourceID());
        HashMap<String, String> map = new HashMap<>();
        map.put("message","OK");
        return map;
    }
}
