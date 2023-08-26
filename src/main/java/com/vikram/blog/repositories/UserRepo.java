package com.vikram.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vikram.blog.entities.User;

public interface UserRepo extends JpaRepository<User, Integer>{

}
