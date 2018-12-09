package com.niit.backend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Supplier {

	@Id
	@GeneratedValue
	public int SupplierId;
	public String SupplierName;
	public String Address;
	
	
	public int getSupplierId() {
		return SupplierId;
	}
	public void setSupplierId(int supplierId) {
		SupplierId = supplierId;
	}
	public String getSupplierName() {
		return SupplierName;
	}
	public void setSupplierName(String supplierName) {
		SupplierName = supplierName;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	
	}


