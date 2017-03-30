package com.serviceImpl;

import java.io.File;
import java.io.IOException;
import java.security.Principal;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import com.dao.ProductDao;
import com.dao.UserDao;
import com.entity.Product;
import com.entity.Role;
import com.entity.User;
import com.service.UserService;
import com.validator.Validator;

@Service("userDetailsService")
public class UserServiceImpl implements UserService, UserDetailsService {

	@Autowired
	 UserDao userDao;

	@Autowired
	ProductDao productDao;

	@Autowired
	 BCryptPasswordEncoder encoder;

	
	@Autowired
	@Qualifier("userValidator")
	 Validator validator;

	public void save(User user) throws Exception {

		validator.validate(user);
		System.out.println(user.getPassword());
		user.setRole(Role.ROLE_USER);
		user.setPassword(encoder.encode(user.getPassword()));
		userDao.save(user);

	}

	public List<User> findAll() {

		return userDao.findAll();
	}

	public User findOne(int id) {
		// TODO Auto-generated method stub
		return userDao.findOne(id);
	}

	public void delete(int id) {
		userDao.delete(id);

	}

	public User findByName(String name) {
		// TODO Auto-generated method stub
		System.out.println(userDao.findByName(name));
		return userDao.findByName(name);
	}

	public UserDetails loadUserByUsername(String name) throws UsernameNotFoundException {

		System.out.println(userDao.findByName(name));

		return userDao.findByName(name);
	}

	@Transactional
	public void buyProduct(Principal principal, String id) {
		User user = userDao.findOne(Integer.parseInt(principal.getName()));

		Product product = productDao.findOne(Integer.parseInt(id));

		user.getProducts().add(product);

	}

	@Transactional
	public void saveImage(Principal principal, MultipartFile multipartFile) {

		User user = userDao.findOne(Integer.parseInt(principal.getName()));

		String path = System.getProperty("catalina.home") + "/resources/" + user.getName() + "/"
				+ multipartFile.getOriginalFilename();

		user.setPathImage("resources/" + user.getName() + "/" + multipartFile.getOriginalFilename());

		File file = new File(path);

		try {
			file.mkdirs();
			try {
				FileUtils.cleanDirectory(
						new File(System.getProperty("catalina.home") + "/resources/" + user.getName() + "/"));
			} catch (IOException e) {
				e.printStackTrace();
			}
			multipartFile.transferTo(file);
		} catch (IOException e) {
			System.out.println("error with file");
		}
	}

	public User fetchUserWithProduct(int id) {
		// TODO Auto-generated method stub
		return userDao.fetchUserWithProduct(id);
	}

	public User findByUUID(String uuid) {
		// TODO Auto-generated method stub
		return userDao.findByUUID(uuid);
	}

	public void update(User user) {
		userDao.save(user);

	}

	/*
	 * public void updateProfile(User user) {
	 * user.setPassword(encoder.encode(user.getPassword())); userDao.save(user);
	 * 
	 * }
	 */

}
