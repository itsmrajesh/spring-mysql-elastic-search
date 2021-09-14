package com.lwl.elasticsearchdemo.utils;

import com.lwl.elasticsearchdemo.model.User;
import com.lwl.elasticsearchdemo.model.UserModel;

public class AppUtils {

	public static UserModel toUserModel(User u) {
		return new UserModel(u.getId(), u.getFirst_name(), u.getLast_name(), u.getEmail(), u.getGender(), u.getUid());
	}

}
