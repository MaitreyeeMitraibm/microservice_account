
package com.example.demo.repo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.model.Account;

import jakarta.persistence.TypedQuery;

@Component(value = "accountRepository")
@EnableTransactionManagement
public class AccountrepositoryImpl implements AccountRepository {
	private SessionFactory sessionFactory;

	public AccountrepositoryImpl(SessionFactory sessionFactory) {
		super();
		this.sessionFactory = sessionFactory;
	}

	public AccountrepositoryImpl() {
		super();
	}



	@Override
	@Transactional
	public Account createAccount(Account account) { // TODO
		Session session = sessionFactory.openSession();
		System.out.println(session);
		
		  session.getTransaction().begin(); //session.persist(account);
		 
		  session.getTransaction().commit();
		 return account;
	}

	@Override
	public List<Account> getAllAccounts() { // TODO Auto-generated
		Session session = sessionFactory.openSession();
		TypedQuery<Account> query = session.createQuery("FROM Account A", Account.class);
		return query.getResultList();
	}

}
