package com.niit.backend.dao;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.backend.model.Product;

@Repository("ProductDaoImplementation")
@Transactional
public class ProductDaoImplementation implements ProductDao {
	@Autowired
	SessionFactory sessionfactory;

	public void addproduct(Product obj) {
		System.out.println(obj);
		sessionfactory.getCurrentSession().saveOrUpdate(obj);
		
	}
	@SuppressWarnings("unchecked")
	public List<Product> getAllProducts() {
		System.out.println("GET ALL PRODUCT DAO");
		return  (List<Product>) sessionfactory.getCurrentSession().createCriteria(Product.class).list();
	}

	public Product getProductById(int productId) {
		// TODO Auto-generated method stub
		Session session=sessionfactory.openSession();
		Product product=(Product)session.get(Product.class,productId);
	    session.close();
		return product;
	}

	public void deleteProduct(Product obj) {
		System.out.println(obj);
		sessionfactory.getCurrentSession().delete(obj);
		
	}


}
