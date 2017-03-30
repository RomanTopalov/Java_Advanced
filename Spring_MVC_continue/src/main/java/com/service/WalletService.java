package com.service;

import java.util.List;

import com.proj.Wallet;

public interface WalletService {
	void create(Wallet wallet);
	List<Wallet>findAll();
	void delete(String name_wallet);
}
