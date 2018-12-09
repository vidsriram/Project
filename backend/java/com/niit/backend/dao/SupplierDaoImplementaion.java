package com.niit.backend.dao;

import java.util.List;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.backend.model.Supplier;

@Repository
@Transactional
public class SupplierDaoImplementaion implements SupplierDao {

	@Autowired
	SessionFactory sessionFactory;

	public void addSupplier(Supplier obj) {
		// TODO Auto-generated method stub
		System.out.println(obj.getSupplierName());
		sessionFactory.getCurrentSession().saveOrUpdate(obj);

	}

	public List<Supplier> getAllSuppliers() {
		// TODO Auto-gener
		System.out.println("Get all Suppliers DAO");
		return (List<Supplier>) sessionFactory.getCurrentSession().createCriteria(Supplier.class).list();

	}

	public Supplier getSupplierById(int SupplierId) {
		Session session=sessionFactory.openSession();
		Supplier supplier=(Supplier)session.get(Supplier.class,SupplierId);
		session.close();
		return supplier;
	}

	public void deleteSupplier(Supplier obj) {
		// TODO Auto-generated method stub
		System.out.println(obj.getSupplierName());
		sessionFactory.getCurrentSession().delete(obj);

	}

}
