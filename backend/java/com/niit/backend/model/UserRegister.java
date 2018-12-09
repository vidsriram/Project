package com.niit.backend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;



@Entity
@Table
public class UserRegister {
	@Id
	@GeneratedValue
	@Column(name="User_id")
	private int id;
	@Column(name="User_name")
	public String name;
	@Column(name="User_email")
	private String email;
	@Column(name="User_contact")
	private String contact;
	@Column(name="User_address")
	private String address;
	@Column(name="User_password")
	private String password;
	@Column(name="User_Role")
	private String role ="Role_user";
	@Column(name="User_enabled")
	private boolean enabled= true;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public boolean isEnabled() {
		return enabled;
	}
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
}
