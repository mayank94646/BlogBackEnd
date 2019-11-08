package com.blogProject.Blog.repository;

import com.blogProject.Blog.model.Following;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FollowingRepository extends JpaRepository<Following,Integer> {
}
