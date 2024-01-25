package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.example.demo.model.Account;
@Component(value = "accountService")
public interface AccountService {
	Account createAccount(Account account);

	List<Account> getAllAccounts();
}