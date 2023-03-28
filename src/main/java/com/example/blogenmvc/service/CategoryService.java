package com.example.blogenmvc.service;

import com.example.blogenmvc.dao.CategoryDao;
import com.example.blogenmvc.entity.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    @Autowired
    private CategoryDao categoryDao;

    public void saveCategory(Category category){
        categoryDao.save(category);
    }

    public List<Category> findAllCategory(){
        return categoryDao.findAll();
    }















}