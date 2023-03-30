package com.bookbazaar.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.bookbazaar.model.Payment;

@Repository
public interface PaymentDao extends CrudRepository<Payment , Integer>{

}
