package com.daoImpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.dao.WalletDao;
import com.proj.Wallet;
@Repository
public class WaletDaoImpl implements WalletDao {

	@PersistenceContext(unitName="Primary")
	private EntityManager entityManager;
	@Transactional
	public void save(Wallet wallet) {
	entityManager.persist(wallet);
		
	}
	@Transactional
	public List<Wallet> findAll() {
		// TODO Auto-generated method stub
		return entityManager.createNamedQuery("findAllWallet").getResultList();
	}
	@Transactional
	public void delete(String name_wallet) {
		entityManager.remove(name_wallet);
		
	}

}
