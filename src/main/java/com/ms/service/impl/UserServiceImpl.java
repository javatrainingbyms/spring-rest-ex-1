package com.ms.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ms.dao.UserDAO;
import com.ms.entity.User;
import com.ms.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDAO userDAO;
	
	@Override
	public User findUserById(String userid) {
		User user=userDAO.findUserById(userid);
		return user;
	}

}
