package com.dao;

import java.util.List;

import com.proj.Wallet;

public interface WalletDao {
	void save(Wallet wallet);
	List<Wallet>findAll();
	void delete(String name_wallet);
}
