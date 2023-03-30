package com.bookbazaar.service;

import java.util.List;

import com.bookbazaar.model.Cart;

public interface CartService {
	void addCart(Cart cart);
	void removeAll();
	void removeById(int id);
	List<Cart> getAll();

}
