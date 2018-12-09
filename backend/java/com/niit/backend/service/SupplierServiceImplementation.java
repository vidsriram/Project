package com.niit.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niit.backend.dao.SupplierDao;
import com.niit.backend.model.Supplier;

@Service
public class SupplierServiceImplementation implements SupplierService{

	@Autowired
	SupplierDao supplierDao;
	
	public void addSupplier(Supplier obj) {
		// TODO Auto-generated method stub
		supplierDao.addSupplier(obj);
	}

	public List<Supplier> getAllSuppliers() {
		// TODO Auto-generated method stub
		return supplierDao.getAllSuppliers();
		
	}

	public Supplier getSupplierById(int SupplierId) {
		// TODO Auto-generated method stub
		return supplierDao.getSupplierById(SupplierId);
	}

	public void deleteSupplier(Supplier obj) {
		// TODO Auto-generated method stub
		supplierDao.deleteSupplier(obj);
		
	}

}
