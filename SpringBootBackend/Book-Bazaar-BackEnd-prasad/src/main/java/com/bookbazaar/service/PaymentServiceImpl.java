package com.bookbazaar.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookbazaar.dao.PaymentDao;
import com.bookbazaar.model.Payment;
@Service
public class PaymentServiceImpl implements PaymentService{
	@Autowired
	private PaymentDao paymentDao;

	@Override
	public void addPayment(Payment payment) {
		paymentDao.save(payment);
		
	}

}
