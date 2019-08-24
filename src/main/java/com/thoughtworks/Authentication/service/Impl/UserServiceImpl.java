package com.thoughtworks.Authentication.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thoughtworks.Authentication.entity.User;
import com.thoughtworks.Authentication.repository.UserRepository;
import com.thoughtworks.Authentication.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	public User save(User user) {
		return userRepository.save(user);
	}

	public User findByEmail(String email) {
		return userRepository.findByEmail(email);
	}

}
