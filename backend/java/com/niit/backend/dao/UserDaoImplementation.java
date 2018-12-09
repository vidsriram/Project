package com.niit.backend.dao;
import java.util.List;
import java.util.Set;

import javax.transaction.Transactional;

import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.backend.model.Product;
import com.niit.backend.model.UserRegister;



@SuppressWarnings("deprecation")
@Repository("UserDAO")
@Transactional
public class UserDaoImplementation implements UserDao {
@Autowired
SessionFactory sessionfactory;
public void save(UserRegister entity) {
	Session session=sessionfactory.openSession();
	session.beginTransaction();
	session.save(entity);
	session.getTransaction().commit();
	session.close();
	// TODO Auto-generated method stub
	
}
public boolean validate(String email, String password) {
	Session session=sessionfactory.openSession();
	String hql = "FROM UserModel u WHERE u.email = '" + email +"' AND u.password ='" + password + "'" ;
	Query query = session.createQuery(hql);
	List results = query.list();
	session.close();
	if(results!=null)
		return true;
	
	else
		return false;		
	
}
public void delete(int id) {
	// TODO Auto-generated method stub
	
}
public void update(UserRegister entity) {
	// TODO Auto-generated method stub
	
}
public UserRegister findById(String email) {
	// TODO Auto-generated method stub
	Session session=sessionfactory.openSession();
	String hql = "FROM UserModel u WHERE u.email = '" + email +"'" ;
	Query query = session.createQuery(hql);
	List results=null;
	results = query.list();
	session.close();
	if(results!=null )/*&& results.size()!=0)*/
		return (UserRegister) results.get(0);
	else
		return null;		
}
public Set<UserRegister> findAll() {
	// TODO Auto-generated method stub
	return null;
}


}
