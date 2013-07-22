package com.vas.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.vas.home.Vascon;
import com.vas.util.HibernateUtil;

public class VasconDao {
	
	public void addVascon(Vascon vas){
		Transaction t = null;
		Session session = HibernateUtil.getSessionFactory().openSession();
		try{
			t= session.beginTransaction();
			session.save(vas);
			session.getTransaction().commit();
		}catch(RuntimeException rex){
			if(t!=null){
				t.rollback();
			}
			rex.printStackTrace();
		}
		finally{
			session.flush();
			session.close();
		}
		}
		public void updateVascon(Vascon vas){
			Session session = HibernateUtil.getSessionFactory().openSession();
			Transaction t =null;
			try{
				t = session.beginTransaction();
				session.update(vas);
				session.getTransaction().commit();
		}
			catch(RuntimeException rex){
			if (t != null){
				t.rollback();
			}
			rex.printStackTrace();
		}
			finally{
		session.close();
		session.flush();
			
	}
			}
			public void deleteVascon(int id){
				Vascon vas = null;
				Transaction t = null;
				Session session = HibernateUtil.getSessionFactory().openSession();
				try{
					t = session.beginTransaction();
					vas = (Vascon)session.get(Vascon.class, new Integer(id));
					session.delete(vas);
					session.getTransaction().commit();
				}catch(RuntimeException rex){
					if(t !=null){
						t.rollback();
					}
					rex.printStackTrace();
				}
					
				}
	
			public Vascon getVasconById(int id){
				Vascon vas = null;
				Transaction t = null;
				Session session = HibernateUtil.getSessionFactory().openSession();
				try{
					t= session.beginTransaction();
					String queryString = "from Vasconsulting where id = :id";
					Query query = session.createQuery(queryString);
					query.setInteger("id", id);
					vas= (Vascon) query.uniqueResult();
					} catch(RuntimeException rex){
						rex.printStackTrace();
						}finally{
						session.flush();
						session.close();
						}
				return vas;
					}
			
			public List<Vascon> getAllVascon(){
				List<Vascon> staff = new ArrayList<Vascon>();
				Transaction t = null;
				Session session = HibernateUtil.getSessionFactory().openSession();
				try{
					t = session.beginTransaction();
					staff = session.createQuery("from Vascon").list();
				}catch(RuntimeException rex){
					rex.printStackTrace();
				}finally{
					session.flush();
					session.close();
				}
				return staff;
					
				}
			}
			
	

	


