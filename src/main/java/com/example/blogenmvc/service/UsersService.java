package com.example.blogenmvc.service;

import com.example.blogenmvc.dao.UsersDao;
import com.example.blogenmvc.entity.Users;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersService {
    @Autowired
    private UsersDao usersDao;

    public void saveUser(Users  user) {
        usersDao.save(user);
    }

    public List<Users> findAllUsers() {
        return usersDao.findAll();
    }


}
