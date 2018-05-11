package com.kindacg.dao.impl;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.kindacg.dao.UserDao;
import com.kindacg.entity.User;

@Repository
public class UserDaoImpl extends DaoTemplateImpl<User> implements UserDao{
	
	
	public User Login (User u) throws Exception{
		
		String hql = "from " + classes.getName() + " as u where u.u_account=:u_account and u.u_password=:u_password";
		Query query = getSessionFactory().getCurrentSession().createQuery(hql);
		query.setString("u_account", u.getU_account());
		query.setString("u_password", u.getU_password());
		return (User)query.uniqueResult();
	}
}
