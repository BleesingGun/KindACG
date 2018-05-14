package com.kindacg.dao.impl;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import com.kindacg.dao.AdministratorDao;
import com.kindacg.entity.Administrator;

@Repository
public class AdministratorDaoImpl extends DaoTemplateImpl<Administrator> 
	implements AdministratorDao{

	@Override
	public Administrator Login(Administrator a) throws Exception {
		String hql = "from " + classes.getName() + " as a where a.a_account=:a_account and a.a_password=:a_password";
		//System.out.println(classes.getName());
		Query query = getSessionFactory().getCurrentSession().createQuery(hql);
		query.setString("a_account", a.getA_account());
		query.setString("a_password", a.getA_password());
		return (Administrator)query.uniqueResult();
	}
}
