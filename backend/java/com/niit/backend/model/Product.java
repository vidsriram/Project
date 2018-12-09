package com.niit.backend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;

import org.springframework.web.multipart.MultipartFile;

@Entity
public class Product {
	
	@Id
	@GeneratedValue
	public int productId;
	public String prodName;
	public String prodDesc; 
	public 	int quantity;
	public int price;
	
	
	
	 @ManyToOne
	 @JoinColumn(name="categoryId")
	 public Category category;
	 
	 @ManyToOne
	 @JoinColumn(name="SupplierId")
	 public Supplier supplier;
	 
	 @Transient
	 MultipartFile pimage;
	 
	 

	public Product() {
		super();
	}

	
	public Product(int productId, String prodName, String prodDesc, int quantity, int price, Category category,
			Supplier supplier, MultipartFile pimage) {
		super();
		this.productId = productId;
		this.prodName = prodName;
		this.prodDesc = prodDesc;
		this.quantity = quantity;
		this.price = price;
		this.category = category;
		this.supplier = supplier;
		this.pimage = pimage;
	}


	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public String getProdDesc() {
		return prodDesc;
	}

	public void setProdDesc(String prodDesc) {
		this.prodDesc = prodDesc;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Supplier getSupplier() {
		return supplier;
	}

	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}

	public MultipartFile getPimage() {
		return pimage;
	}

	public void setPimage(MultipartFile pimage) {
		this.pimage = pimage;
	}
	 
	 
	 
	
	}
