package com.bookbazaar.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.bookbazaar.model.OrderBook;

@Repository
public interface OrderBookDao extends CrudRepository<OrderBook , Integer>{

}
