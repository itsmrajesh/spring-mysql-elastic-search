package com.lwl.elasticsearchdemo.config;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.lwl.elasticsearchdemo.model.User;
import com.lwl.elasticsearchdemo.repo.IUserESRepo;
import com.lwl.elasticsearchdemo.repo.UserRepo;
import com.lwl.elasticsearchdemo.utils.AppUtils;

import lombok.extern.slf4j.Slf4j;

@Profile("init")
@Service
@Slf4j
public class SyncData {

	private UserRepo userRepo;

	private IUserESRepo iUserESRepo;

	public SyncData(UserRepo userRepo, IUserESRepo iUserESRepo) {
		super();
		this.userRepo = userRepo;
		this.iUserESRepo = iUserESRepo;
	}

	@PostConstruct
	public void syncDataToES() {
		List<User> users = userRepo.findAll();
		log.info("Total users found from MySQL DB: {}", users.size());
		log.info("Syncing data to ES");
		users.forEach(user -> {
			iUserESRepo.save(AppUtils.toUserModel(user));
		});
		log.info("Sync Completed");
	}

}
