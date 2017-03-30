package com.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.WalletDao;
import com.proj.Wallet;
import com.service.WalletService;
@Service("walletService")
public class WalletDaoImpl implements WalletService{

	@Autowired
	private WalletDao walletDao;
	
	public void create(Wallet wallet) {
		walletDao.save(wallet);
	}

	public List<Wallet> findAll() {
		// TODO Auto-generated method stub
		return walletDao.findAll();
	}

	public void delete(String name_wallet) {
		walletDao.delete(name_wallet);
		
	}

}
