package com.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.UsersDao;
import com.proj.Users;
import com.service.UsersService;
@Service("usersService")
public class UsersServiceImpl  implements UsersService{
	@Autowired
	private UsersDao usersDao;
	
	
	public void create(Users users) {
		usersDao.save(users);
		
	}

	public List<Users> findAll() {
		// TODO Auto-generated method stub
		return usersDao.findAll();
	}

	public Users findOne(String name) {
		// TODO Auto-generated method stub
		return usersDao.findOne(name);
	}

	public void delete(String name) {
		usersDao.delete(name);
		
	}

}
