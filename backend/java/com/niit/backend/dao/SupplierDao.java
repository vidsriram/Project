package com.niit.backend.dao;

import java.util.ArrayList;
import java.util.List;

import com.niit.backend.model.Supplier;

public interface SupplierDao {
	
	public void addSupplier(Supplier obj);
	public  List<Supplier> getAllSuppliers();
	public Supplier getSupplierById(int SupplierId);
	public void deleteSupplier(Supplier obj);

}
