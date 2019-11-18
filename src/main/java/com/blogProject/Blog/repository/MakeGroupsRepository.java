package com.blogProject.Blog.repository;

import com.blogProject.Blog.model.MakeGroups;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MakeGroupsRepository extends JpaRepository<MakeGroups,Integer> {
}
