package com.gxuwz.schools.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
public  abstract class BaseDao {
	private SessionFactory sessionFactory;
	
	public Session getSession(){
		Session session = sessionFactory.getCurrentSession();
		return session;
	}

	
	//get set����


	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
}
