package com.bookbazaar.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookbazaar.dao.CartDao;
import com.bookbazaar.model.Cart;
@Service
public class CartServiceImpl implements CartService{

	@Autowired
	private CartDao cartDao;

	@Override
	public void addCart(Cart cart) {
		cartDao.save(cart);
	}

	@Override
	public void removeAll() {
		cartDao.deleteAll();
		
	}

	@Override
	public List<Cart> getAll() {
		Iterable<Cart> itr = cartDao.findAll();
		List<Cart> lst = new ArrayList<Cart>();
		itr.forEach(ele->lst.add(ele));
		return lst;
	}

	@Override
	public void removeById(int id) {
		cartDao.deleteById(id);
		
	}
}
