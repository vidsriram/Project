package com.niit.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niit.backend.dao.CategoryDao;
import com.niit.backend.model.Category;

@Service
public class CategoryServiceImplementation implements CategoryService{

	@Autowired
	CategoryDao categoryDao;
	
	public void addCategory(Category obj) {
		// TODO Auto-generated method stub
	categoryDao.addCategory(obj);	
	}

	public List<Category> getAllCategory() {
		// TODO Auto-generated method stub
		System.out.println("Get all service");
		return categoryDao.getAllCategory();
	}

	public Category getCategoryById(int categoryId) {
		// TODO Auto-generated method stub
		return categoryDao.getCategoryById(categoryId);
	}

	public void deleteCategory(Category obj) {
		// TODO Auto-generated method stub
		categoryDao.deleteCategory(obj);
		
	}

}
