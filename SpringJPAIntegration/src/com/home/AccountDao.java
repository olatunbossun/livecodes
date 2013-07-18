package com.home;

import java.util.*;
import org.springframework.orm.jpa.support.*;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class AccountDao extends JpaDaoSupport{
	public void createAccount(int accountNumber, String owner, double balance){
		Account account	= new Account(accountNumber,owner,balance);
		getJpaTemplate().persist(account);
	}
	public void updateBalance(int accountNumber, double newBalance){
		Account account = getJpaTemplate().find(Account.class, accountNumber);
		if(account != null){
			account.setBalance(newBalance);
		}
		getJpaTemplate().merge(account);
	}
	public void deleteAccount(int accountNumber){
		Account account = getJpaTemplate().find(Account.class, accountNumber);
		if(account != null){
			getJpaTemplate().remove(account);
		}
	}
		public List<Account>getAllAccounts(){
			List<Account> accounts = getJpaTemplate().find("select acc from Account acc");
			return accounts;
		}
	}
