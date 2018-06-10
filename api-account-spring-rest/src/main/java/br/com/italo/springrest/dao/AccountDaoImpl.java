package br.com.italo.springrest.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import br.com.italo.springrest.domain.Account;

@Repository
public class AccountDaoImpl implements AccountDao{

	@PersistenceContext
	private EntityManager entityManager;  
	
	public void save(Account account) {
		entityManager.persist(account);
	}

	public void update(Account account) {
		entityManager.merge(account);
	}

	public void delete(Long id) {
		entityManager.remove(entityManager.getReference(Account.class, id));
	}

	public Account findById(Long id) {
		 Account account = entityManager.find(Account.class, id);
	     return account;
	}

	public List<Account> findAll() {
		return entityManager
				.createQuery("select a from Account a", Account.class)
				.getResultList();
	}

}
