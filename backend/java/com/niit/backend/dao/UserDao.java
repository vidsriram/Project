package com.niit.backend.dao;

import java.util.List;
import java.util.Set;

import com.niit.backend.model.UserRegister;

public interface UserDao {
	public void save(UserRegister entity);
	public void delete(int id);
	public void update(UserRegister entity);
	public UserRegister findById(String email);
	public boolean validate(String email, String password);
	public Set<UserRegister> findAll();

}
