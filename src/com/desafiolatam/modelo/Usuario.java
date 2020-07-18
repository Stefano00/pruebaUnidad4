package com.desafiolatam.modelo;

public class Usuario {
	
	private String name;;
	private int phone;
	private String date;
	private String pass;
	private String email;
	public Usuario(String name, int phone, String date, String pass, String email) {
		super();
		this.name = name;
		this.phone = phone;
		this.date = date;
		this.pass = pass;
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public String getDate() {
		return date;
	}
	public void setAddress(String address) {
		this.date = address;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
