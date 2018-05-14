package com.kindacg.dao;

import com.kindacg.entity.Administrator;

public interface AdministratorDao extends DaoTemplate<Administrator>{
	public Administrator Login(Administrator a) throws Exception;
}
