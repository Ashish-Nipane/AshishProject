package com.bookbazaar.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bookbazaar.model.Bank;

@Repository
public interface BankDao extends CrudRepository<Bank , Integer>{

}
