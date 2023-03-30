package com.bookbazaar.service;

import com.bookbazaar.model.Bank;

public interface BankService {
	void addBank(Bank bank);
	void modifyBank(Bank bank);
	Bank getByFk_bank_user1_id(int fk_bank_user1_id);
	void removeByBank_id(int bank_id);
	
	

}
