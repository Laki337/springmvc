package com.example.springboot.service;


import com.example.springboot.dao.UserDao;
import com.example.springboot.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {
	
	private UserDao userDao;
	
	@Autowired
	public UserServiceImpl(UserDao userDao) {
		this.userDao = userDao;
	}
	
	@Override
	public void createUser(User user) {
		this.userDao.createUser(user);
	}
	
	@Override
	public User getUserById(Long id) {
		return this.userDao.getUserById(id);
	}
	
	@Override
	public void updateUser(User user) {
		this.userDao.updateUser(user);
	}
	
	@Override
	public void deleteUser(Long id) {
		this.userDao.deleteUser(id);
	}
	
	@Override
	public List<User> getUsers() {
		return this.userDao.getUsers();
	}
}
