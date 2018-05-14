package com.kindacg.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kindacg.dao.UserDao;
import com.kindacg.entity.User;

@Service
public class UserServiceDaoImpl {
	
	@Autowired
	UserDao userDao;
	
	
	
	public User Login(User u) throws Exception{
		return userDao.Login(u);
	}
	public int Save_user(User u) throws Exception{
		return userDao.save(u);
	}
}
