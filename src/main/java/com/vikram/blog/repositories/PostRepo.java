package com.vikram.blog.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vikram.blog.entities.Category;
import com.vikram.blog.entities.Post;
import com.vikram.blog.entities.User;

public interface PostRepo extends JpaRepository<Post, Integer> {

	List<Post> findAllByUser(User user);

	List<Post> findByCategory(Category category);

	List<Post> findByTitleContaining(String title);

	// @Query("select p from Post p where p.title like :key")
	// List<Post> searchByTitle(@Param("key") String title);
}
