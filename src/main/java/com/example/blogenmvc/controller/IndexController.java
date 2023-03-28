package com.example.blogenmvc.controller;

import com.example.blogenmvc.entity.Category;
import com.example.blogenmvc.entity.Post;
import com.example.blogenmvc.entity.Users;
import com.example.blogenmvc.service.CategoryService;
import com.example.blogenmvc.service.PostService;
import com.example.blogenmvc.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    @Autowired
    private CategoryService categoryService;
    @Autowired
    private UsersService usersService;
    @Autowired
    private PostService postService;

    @GetMapping("/")
    public String home(Model model){
        model.addAttribute("allUser",
                usersService.findAllUsers());
        model.addAttribute("categories",
                categoryService.findAllCategory());
        model.addAttribute("post",new Post());
        model.addAttribute("user",new Users());
        model.addAttribute("category",new Category());
        model.addAttribute("posts",postService.findAllPost());
        return "home";
    }
}

