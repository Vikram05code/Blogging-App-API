package com.vikram.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vikram.blog.entities.Comment;

public interface CommentRepo extends JpaRepository<Comment, Integer> {

}
