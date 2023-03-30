package com.bookbazaar.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookbazaar.dao.OrderBookDao;
import com.bookbazaar.model.OrderBook;
@Service
public class OrderBookServiceImpl implements OrderBookService{
	@Autowired
	private OrderBookDao orderBookDao;

	@Override
	public void addOrderBook(OrderBook orderBook) {
		orderBookDao.save(orderBook);
		
	}

}
