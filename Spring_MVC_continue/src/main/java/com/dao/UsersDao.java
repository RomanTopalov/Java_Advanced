package com.dao;

import java.util.List;

import com.proj.Users;



public interface UsersDao {
	void save(Users users);
	List<Users>findAll();
	Users findOne(String name);
	void delete(String name);
}
