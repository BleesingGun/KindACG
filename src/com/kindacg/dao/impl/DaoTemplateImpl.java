package com.kindacg.dao.impl;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.kindacg.dao.DaoTemplate;
import com.kindacg.entity.User;

public class DaoTemplateImpl<T> extends HibernateDaoSupport implements DaoTemplate<T>{
	
	protected Class<T> classes;
	
	public DaoTemplateImpl(){
		
		ParameterizedType pt = (ParameterizedType)this.getClass().getGenericSuperclass();
		this.classes = (Class<T>)pt.getActualTypeArguments()[0];
	}
	
	@Autowired
	public void setSessionFactory1(SessionFactory sessionFactory){
		
		super.setSessionFactory(sessionFactory);
	}

	@Override
	public int save(T t) throws Exception {
		// TODO Auto-generated method stub
		this.getSessionFactory().getCurrentSession().save(t);
		//this.getHibernateTemplate().save(t);
		return 1;
	}

	@Override
	public int delete(T t) throws Exception {
		// TODO Auto-generated method stub
		this.getSessionFactory().getCurrentSession().delete(t);
		return 1;
	}

	@Override
	public int delete(int id) throws Exception {
		// TODO Auto-generated method stub
		T temp = (T)this.getSessionFactory().getCurrentSession().load(classes, id);
		return delete(temp);
	}

	@Override
	public int update(T t) throws Exception {
		// TODO Auto-generated method stub
		this.getSessionFactory().getCurrentSession().update(t);
		return 1;
	}

	@Override
	public List<T> select() throws Exception {
		// TODO Auto-generated method stub
		String hql = "from com.kindacg.entity.User";
		Query query = this.getSessionFactory().getCurrentSession().createQuery(hql);
		return query.list();
	}

	@Override
	public T get(int id) throws Exception {
		// TODO Auto-generated method stub
		return (T)this.getSessionFactory().getCurrentSession().get(classes, id);
	}
	
	

}
