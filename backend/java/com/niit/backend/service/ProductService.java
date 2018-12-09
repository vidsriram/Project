package com.niit.backend.service;

import java.util.ArrayList;
import java.util.List;

import com.niit.backend.model.Product;

public interface ProductService {
	public void addproduct(Product obj);
	public List<Product> getAllProducts();
	public Product getProductById(int Proid);
	public void deleteProduct(Product obj);


}
