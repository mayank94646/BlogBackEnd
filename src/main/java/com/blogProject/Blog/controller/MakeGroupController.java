package com.blogProject.Blog.controller;

import com.blogProject.Blog.service.MakeGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
public class MakeGroupController {
    @Autowired
    MakeGroupService makeGroupService;
}
