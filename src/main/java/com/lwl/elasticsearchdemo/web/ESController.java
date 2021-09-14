package com.lwl.elasticsearchdemo.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lwl.elasticsearchdemo.model.UserModel;
import com.lwl.elasticsearchdemo.services.ESUserService;

@RestController
@RequestMapping("/api/v1/es/user/")
public class ESController {

	private ESUserService userService;

	public ESController(ESUserService userService) {
		super();
		this.userService = userService;
	}

	@GetMapping("{id}")
	public UserModel getUserById(@PathVariable String id) {
		return userService.getUserById(id);
	}
}
