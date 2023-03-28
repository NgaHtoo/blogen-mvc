package com.example.blogenmvc.dao;

import com.example.blogenmvc.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostDao extends JpaRepository<Post,Integer> {
}
