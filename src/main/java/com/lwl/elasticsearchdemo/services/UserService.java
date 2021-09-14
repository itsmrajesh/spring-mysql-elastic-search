package com.lwl.elasticsearchdemo.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.lwl.elasticsearchdemo.model.User;
import com.lwl.elasticsearchdemo.repo.UserRepo;

@Service
public class UserService {

	private UserRepo userRepo;

	public UserService(UserRepo userRepo) {
		super();
		this.userRepo = userRepo;
	}

	public List<User> getAllUsers() {
		List<User> users = userRepo.findAll();
		return users;
	}

}
