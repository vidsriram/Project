package com.niit.backend.config;

import com.niit.backend.dao.SupplierDaoImplementaion;
import com.niit.backend.model.Supplier;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Testing testing ");

try {
	Supplier  s = new Supplier();
	s.setSupplierId(1001);
	s.setSupplierName("Vasanth and Co");

	SupplierDaoImplementaion obj = new SupplierDaoImplementaion();
	obj.addSupplier(s);
}catch(Exception e) {
	System.out.println("Error "+ e);
}
	
	}

}
