package com.thoughtworks.Authentication.service;

import com.thoughtworks.Authentication.entity.User;

public interface UserService {
	User save(User user);

	User findByEmail(String email);
}
