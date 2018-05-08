package com.kindacg.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kindacg.dao.UserDao;
import com.kindacg.entity.User;

@Service
public class UserServiceDaoImpl {
	
	@Autowired
	UserDao userDao;
	
	public User Login(User u) throws Exception{
		return userDao.Login(u);
	}
}
