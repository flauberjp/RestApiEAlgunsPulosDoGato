package br.com.italo.springrest.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.italo.springrest.dao.AccountDao;
import br.com.italo.springrest.domain.Account;

@Service
@Transactional
public class AccountServiceImpl implements AccountService{
	
	@Autowired
	private AccountDao dao;
	
	@Override
	public void save(Account account) {
		dao.save(account);
	}

	@Override
	public void update(Long id, Account account) {
        account.setIdAccount(id);
        dao.findById(id);
        dao.update(account);
	}

	@Override
	public void delete(Long id) {
		dao.delete(id);
	}

	@Transactional(readOnly = true)
	@Override
	public Account findById(Long id) {
		return dao.findById(id);
	}

	@Transactional(readOnly = true)
	@Override
	public List<Account> findAll() {
		return dao.findAll();
	}

}
