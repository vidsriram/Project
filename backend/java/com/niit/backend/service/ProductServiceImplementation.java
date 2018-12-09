package com.niit.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niit.backend.dao.ProductDao;
import com.niit.backend.model.Product;

@Service
public class ProductServiceImplementation implements ProductService {
	@Autowired
	ProductDao productDaoImplementation;

	public void addproduct(Product obj) {
		productDaoImplementation.addproduct(obj);
		
	}

	public List<Product> getAllProducts() {
		System.out.println("Get product Service");
		return productDaoImplementation.getAllProducts();
	}

	public Product getProductById(int productId) {
	
		return productDaoImplementation.getProductById(productId);
	}

	public void deleteProduct(Product obj) {
		// TODO Auto-generated method stub
		productDaoImplementation.deleteProduct(obj);
	}

}
