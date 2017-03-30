package com.service;

import java.util.List;

import com.proj.Users;

public interface UsersService {

	void create(Users users);
	List<Users>findAll();
	Users findOne(String name);
	void delete(String name);
}
