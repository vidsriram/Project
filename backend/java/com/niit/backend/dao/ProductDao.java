package com.niit.backend.dao;

import java.util.List;


import com.niit.backend.model.Product;

public interface ProductDao {
	public void addproduct(Product obj);
	public List<Product> getAllProducts();
	public Product getProductById(int Proid);
	public void deleteProduct(Product obj);

}
