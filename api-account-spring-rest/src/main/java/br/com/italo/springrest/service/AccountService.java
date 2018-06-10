package br.com.italo.springrest.service;

import java.util.List;

import br.com.italo.springrest.domain.Account;

public interface AccountService {
	void save(Account account);
	
	void update(Long id, Account account);
	
	void delete(Long id);
	
	Account findById(Long id);
	
	List<Account> findAll();
}
