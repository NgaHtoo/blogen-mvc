package com.example.blogenmvc.controller;

import com.example.blogenmvc.entity.Users;
import com.example.blogenmvc.service.UsersService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UsersController {
    @Autowired
    private UsersService usersService;

    @PostMapping("/save-users")
    public String saveUsers(Users user, BindingResult result) {
        if (result.hasErrors()) {
            return "home";
        }
        usersService.saveUser(user);
        return "redirect:/";
    }

    @GetMapping("/list-users")
    public String listAllUsers(Model model) {
        model.addAttribute("allUsers"
                , usersService.findAllUsers());
        return "usersList";
    }


}

