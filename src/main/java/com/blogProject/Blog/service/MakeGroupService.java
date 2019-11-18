package com.blogProject.Blog.service;

import com.blogProject.Blog.repository.MakeGroupsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MakeGroupService {
    @Autowired
    MakeGroupsRepository makeGroupsRepository;
    public void createGroup()
    {

    }

}
