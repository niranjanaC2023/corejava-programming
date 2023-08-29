package com.nit.sisu.streamAPI;

import java.util.List;

public class Customer 
{

	private int id;
	private String email;
	private String name;
	private List<Long> phone;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Long> getPhone() {
		return phone;
	}
	public void setPhone(List<Long> phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", email=" + email + ", name=" + name + ", phone=" + phone + "]";
	}
	public Customer(int id, String email, String name, List<Long> phone) {
		super();
		this.id = id;
		this.email = email;
		this.name = name;
		this.phone = phone;
	}
	
	
	
}
