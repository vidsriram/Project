	package com.niit.backend.dao;

import java.util.List;


import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.backend.model.Category;

@Repository
@Transactional
public class CategoryDaoImplementation implements CategoryDao {
	
	@Autowired
	SessionFactory sessionFactory;

	public void addCategory(Category obj) {
		// TODO Auto-generated method stub
		System.out.println(obj.getCategoryName());
		sessionFactory.getCurrentSession().saveOrUpdate(obj);
	}

	@SuppressWarnings("unchecked")
	public List<Category> getAllCategory() {
		// TODO Auto-generated method stub
		System.out.println("GET ALL CATEGORY DAO");
		return  (List<Category>) sessionFactory.getCurrentSession().createCriteria(Category.class).list();
	}

	public Category getCategoryById(int categoryId) {
		Session session=sessionFactory.openSession();
		Category category=(Category)session.get(Category.class,categoryId);
		session.close();
		return category;
	}

	public void deleteCategory(Category obj) {
		System.out.println(obj.getCategoryName());
		sessionFactory.getCurrentSession().delete(obj);
		
	}
}
