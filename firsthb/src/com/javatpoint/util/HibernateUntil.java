package com.javatpoint.util;

import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;

public class HibernateUntil {

	private static final SessionFactory sessionFactory= buildSessionFactory();
	
	private static final SessionFactory buildSessionFactory(){
		try{
			//Create SessionFactory from hibernate.cfg.xml
			return new Configuration().configure().buildSessionFactory();
		} catch(Exception e ){
			//Make sure you log the exception ,as it might be swallowed 
			System.err.println("Initial Sessionfactory creation failed." +e);
			throw new ExceptionInInitializerError(e);
		}
	}
	
	public static SessionFactory getSessionFactory(){
		return sessionFactory;
	}
}
