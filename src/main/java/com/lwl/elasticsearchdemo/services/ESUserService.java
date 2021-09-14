package com.lwl.elasticsearchdemo.services;

import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import com.lwl.elasticsearchdemo.model.UserModel;
import com.lwl.elasticsearchdemo.repo.IUserESRepo;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class ESUserService {

	private IUserESRepo esRepo;

	public ESUserService(IUserESRepo esRepo) {
		super();
		this.esRepo = esRepo;
	}

	public UserModel getUserById(String id) {
		Assert.hasLength(id, "id is empty");

		Optional<UserModel> userOp = esRepo.findById(id);
		if (userOp.isPresent()) {
			log.info("user found");
			return userOp.get();
		}
		log.error("user not found");
		return null;
	}

}
