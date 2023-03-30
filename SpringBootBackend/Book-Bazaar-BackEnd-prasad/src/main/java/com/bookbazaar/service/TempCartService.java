package com.bookbazaar.service;

import java.util.List;

import com.bookbazaar.model.TempCart;

public interface TempCartService {
	void addTempCart(TempCart tempCart);
	void removeAll();
	void removeById(int id);
	List<TempCart> getAll();

}