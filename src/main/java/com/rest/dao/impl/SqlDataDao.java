package com.rest.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.rest.dao.IDataDao;

import com.rest.model.Data;

public class SqlDataDao implements IDataDao {

	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public Data getData() {
		Session session = sessionFactory.getCurrentSession();
		Data data = (Data) session.get(Data.class, new Integer(1));
		session.close();
		return data;
	}

}
