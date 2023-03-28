package com.example.blogenmvc.service;

import com.example.blogenmvc.dao.CategoryDao;
import com.example.blogenmvc.dao.PostDao;
import com.example.blogenmvc.dao.UsersDao;
import com.example.blogenmvc.entity.Category;
import com.example.blogenmvc.entity.Post;
import com.example.blogenmvc.entity.Users;
import jakarta.persistence.EntityNotFoundException;
import org.apache.catalina.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PostService {
    private CategoryDao categoryDao;
    private PostDao postDao;
    private UsersDao usersDao;

    public PostService(CategoryDao categoryDao, PostDao postDao, UsersDao usersDao) {
        this.categoryDao = categoryDao;
        this.postDao = postDao;
        this.usersDao = usersDao;
    }
    public List<Post> findAllPost(){
        return postDao.findAll();
    }
    @Transactional
    public void savePost(Post post){
        Category category=categoryDao
                .findById(post.getCategory().getId())
                .orElseThrow(EntityNotFoundException::new);
        Users users=usersDao.findById(post.getUsers().getId())
                .orElseThrow(EntityNotFoundException::new);
        category.addPost(post);
        users.addPost(post);
        postDao.save(post);

    }
}

