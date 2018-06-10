package br.com.italo.springrest.dao;

import java.util.List;

import br.com.italo.springrest.domain.Account;

public interface AccountDao {

	void save(Account account);
	
	void update(Account account);
	
	void delete(Long id);
	
	Account findById(Long id);
	
	List<Account> findAll();
	
}
