package com.vikram.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vikram.blog.entities.Category;

public interface CategoryRepo extends JpaRepository<Category, Integer> {

}
