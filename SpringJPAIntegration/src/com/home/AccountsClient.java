package com.home;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;


public class AccountsClient {
public static void main(String[]args){
	
	ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	AccountDao accountDao= context.getBean("accountDaoBean",AccountDao.class);
	
	accountDao.createAccount(1012345,"Bosun Agunbiade",1000000);
	accountDao.createAccount(1011236,"Mariam Momodu",8400000);
	System.out.println("Account created");
	
	
	/*
	accountDao.updateBalance(1012345, 50000000);
	System.out.println("Account Updated");
	
	*/
	
	/*
	List<Account> accounts= accountDao.getAllAccounts();
	for(int i =0;i<accounts.size();i++){
		Account acc =accounts.get(i);
		System.out.println(acc.getAccountNumber()+":"+acc.getOwner()+"(" +acc.getBalance()+")");
		*/
	}
	/*
	accountDao.deleteAccount(1012347);
	System.out.println("Account deleted");
	*/
}

