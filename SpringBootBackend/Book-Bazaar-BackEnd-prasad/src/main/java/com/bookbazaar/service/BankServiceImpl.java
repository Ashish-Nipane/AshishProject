package com.bookbazaar.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookbazaar.dao.BankDao;
import com.bookbazaar.model.Bank;
import com.bookbazaar.model.User;
@Service
public class BankServiceImpl implements BankService{
	@Autowired
	private BankDao bankDao;

	@Override
	public void addBank(Bank bank) {
		bankDao.save(bank);
		
	}

	@Override
	public void modifyBank(Bank bank) {
		bankDao.save(bank);
		
	}

	@Override
	public Bank getByFk_bank_user1_id(int fk_bank_user1_id) {
		Optional<Bank> opt = bankDao.findById(fk_bank_user1_id);
		if(opt.isPresent()) {
			return opt.get();
		}
		return null;
	}

	@Override
	public void removeByBank_id(int bank_id) {
		bankDao.deleteById(bank_id);
		
	}

}
