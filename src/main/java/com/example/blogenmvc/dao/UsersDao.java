package com.example.blogenmvc.dao;

import com.example.blogenmvc.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersDao extends JpaRepository<Users,Integer> {
}

