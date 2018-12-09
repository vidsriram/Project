package com.niit.backend.service;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niit.backend.dao.UserDao;
import com.niit.backend.model.UserRegister;

@Service
public class UserServiceImplementaion implements UserService {
@Autowired
UserDao UserDaoImplementation;

public void save(UserRegister entity) {
	// TODO Auto-generated method stub
	UserDaoImplementation.save(entity);
}

public void delete(int id) {
	// TODO Auto-generated method stub
	
}

public void update(UserRegister entity) {
	// TODO Auto-generated method stub
	
}

public UserRegister findById(String email) {
	// TODO Auto-generated method stub
	return UserDaoImplementation.findById(email);
}

public boolean validate(String email, String password) {
	// TODO Auto-generated method stub
	return UserDaoImplementation.validate(email, password);
}

public Set<UserRegister> findAll() {
	// TODO Auto-generated method stub
	return null;
}
	
}
