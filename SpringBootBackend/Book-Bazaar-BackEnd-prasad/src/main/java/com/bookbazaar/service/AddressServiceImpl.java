package com.bookbazaar.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookbazaar.dao.AddressDao;
import com.bookbazaar.model.Address;
@Service
public class AddressServiceImpl implements AddressService{
	@Autowired
	private AddressDao addressDao;

	@Override
	public void addAddress(Address address) {
		addressDao.save(address);
		
	}

}
