package com.ms.dao;

import com.ms.entity.User;

public interface UserDAO {
	public User findUserById(String userid);
}
