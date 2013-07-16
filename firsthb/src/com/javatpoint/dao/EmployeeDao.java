package com.javatpoint.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.javatpoint.home.Employee;
import com.javatpoint.util.HibernateUntil;

public class EmployeeDao {
	
	public void addEmployee(Employee emp){
		Transaction t = null;
		Session session = HibernateUntil.getSessionFactory().openSession();
		try{
			session.beginTransaction();
			session.save(emp);
			session.getTransaction().commit();
		}catch(RuntimeException rex){
			if(t!=null){
				t.rollback();
			}
			rex.printStackTrace();
		}finally{
			session.flush();
			session.close();
		}
	
	}
	public void deleteEmployee(int id){
		Transaction t = null;
		Session session = HibernateUntil.getSessionFactory().openSession();
		try{
			t = session.beginTransaction();
			Employee emp = (Employee) session.load(Employee.class, new Integer(id));
			session.delete(emp);
			session.getTransaction().commit();
			}catch (RuntimeException rex){
				if(t != null){
					t.rollback();
				}
				rex.printStackTrace();
			}finally{
				session.flush();
				session.close();
			}
	}
	public void updateEmployee(Employee emp){
		Transaction t = null ;
		
		Session session = HibernateUntil.getSessionFactory().openSession();
		try{
			t = session.beginTransaction();
			session.update(emp);
			session.getTransaction().commit();
		}catch(RuntimeException rex){
			if (t != null){
				t.rollback();
			}
			rex.printStackTrace();
		}finally {
			session.flush();
			session.close();
		}
	}
	public List<Employee> getAllEmployee(){
		List<Employee> emps = new ArrayList<Employee>();
		Transaction t = null;
		Session session = HibernateUntil.getSessionFactory().openSession();
		
		try{
			t = session.beginTransaction();
			emps = session.createQuery("from Employee").list();
		}catch(RuntimeException rex){
			rex.printStackTrace();
		}finally{
			session.flush();
			session.close();
		}
		return emps;
		
	}
	
	public Employee getUserById(int id){
		Employee emp = null;
		Transaction t = null;
		Session session = HibernateUntil.getSessionFactory().openSession();
		try{
			t = session.getTransaction();
			String queryString = "from Employee where id = :id";
			Query query = session.createQuery(queryString);
			query.setInteger("id", id);
		}catch(RuntimeException rex){
			rex.printStackTrace();
		}finally{
			session.flush();
			session.close();
		}
		return emp;
	}
	

}
