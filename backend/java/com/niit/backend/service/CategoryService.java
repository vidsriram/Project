package com.niit.backend.service;

import java.util.List;

import com.niit.backend.model.Category;

public interface CategoryService {
	public void addCategory(Category obj);
	public List<Category> getAllCategory();
	public Category getCategoryById(int categoryId);
	public void deleteCategory(Category obj);

}
