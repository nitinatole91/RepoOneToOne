package com.onetoone.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onetoone.demo.model.User;
import com.onetoone.demo.repository.UserRepository;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepository userRepository;
	@Override
	public User saveUser(User user) {
         User saveUser= userRepository.save(user);
          

		return saveUser;
	}

}
