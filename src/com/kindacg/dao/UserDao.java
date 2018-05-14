package com.kindacg.dao;

import com.kindacg.entity.User;

public interface UserDao extends DaoTemplate<User>{
	public User Login(User u) throws Exception;
}
