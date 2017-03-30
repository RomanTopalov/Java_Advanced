package com.service;

import java.security.Principal;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.entity.User;

public interface UserService {

	void save(User user) throws Exception;
	List<User> findAll();
	User findOne(int id);
	
	void delete(int id);
	User findByName(String name);
	
	
	
	void buyProduct(Principal principal, String id);

	public void saveImage(Principal principal, MultipartFile multipartFile);

	User fetchUserWithProduct(int id);

	User findByUUID(String uuid);

	void update(User user);

	/*void updateProfile(User user);*/
}
