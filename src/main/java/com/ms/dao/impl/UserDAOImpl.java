package com.ms.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ms.dao.UserDAO;
import com.ms.entity.User;

@Repository
public class UserDAOImpl implements UserDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public User findUserById(String userid) {
		Session session=sessionFactory.openSession();
		User user=session.get(User.class, userid);
		session.close();
		return user;
	}

}
