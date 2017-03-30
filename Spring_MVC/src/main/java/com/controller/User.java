package com.controller;

public class User {

	private String username;
	private String email;
	private String password;
	
	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(String username, String email, String password) {
		super();
		this.username = username;
		this.email = email;
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [username=" + username + ", email=" + email + ", password=" + password + "]";
	}
	
}
