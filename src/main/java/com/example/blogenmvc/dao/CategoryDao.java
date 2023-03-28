package com.example.blogenmvc.dao;

import com.example.blogenmvc.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryDao extends JpaRepository<Category,Integer> {
}