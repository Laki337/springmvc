package com.example.springboot.service;

import com.example.springboot.model.User;

import java.util.List;

public interface UserService {
	void createUser(User user);
	User getUserById(Long id);
	void updateUser(User user);
	void deleteUser(Long id);
	List<User> getUsers();
}
