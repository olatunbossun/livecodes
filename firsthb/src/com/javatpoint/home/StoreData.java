package com.javatpoint.home;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StoreData {

	public static void main(String[]args){
		
		//creating configuration object
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");//populates the data of the configuration file
		
		//creating session factory object
		SessionFactory factory = cfg.buildSessionFactory();
		
		//creating session object
		Session session = factory.openSession();
		
		//creating transaction object
		Transaction t = session.beginTransaction();
		
		Employee emp = new Employee();
		
		emp.setId(111);
		emp.setFirstName("Ayodele");
		emp.setLastName("Abejide");
		
		session.save(emp);//persisting the object
		
		t.commit();// transaction is committed 
		session.close();
		
		System.out.println("Successfully saved");
		
	}
}
