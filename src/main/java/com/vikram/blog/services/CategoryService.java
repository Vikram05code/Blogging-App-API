package com.vikram.blog.services;

import java.util.List;

import com.vikram.blog.payloads.CategoryDto;

public interface CategoryService {

	// Create
	public CategoryDto createCategory(CategoryDto categoryDto);

	// Update
	public CategoryDto updateCategory(CategoryDto categoryDto, Integer CategoryId);

	// delete
	public void deletecategory(Integer categoryId);

	// Get
	public CategoryDto getCategory(Integer categoryId);

	// GetAll
	public List<CategoryDto> getCategories();
}
