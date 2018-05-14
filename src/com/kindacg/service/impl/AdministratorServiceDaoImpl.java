package com.kindacg.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kindacg.dao.AdministratorDao;
import com.kindacg.entity.Administrator;
import com.kindacg.entity.User;

@Service
public class AdministratorServiceDaoImpl {
	
	@Autowired
	AdministratorDao administratorDao;
	
	public Administrator Login(Administrator a) throws Exception{
		return administratorDao.Login(a);
	}
}
