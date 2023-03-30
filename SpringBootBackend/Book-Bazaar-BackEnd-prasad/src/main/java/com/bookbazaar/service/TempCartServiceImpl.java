package com.bookbazaar.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bookbazaar.dao.TempCartDao;
import com.bookbazaar.model.TempCart;
@Service
public class TempCartServiceImpl implements TempCartService{
	@Autowired
	private TempCartDao tempCartDao;

	@Override
	public void addTempCart(TempCart tempCart) {
		tempCartDao.save(tempCart);
	}

	@Override
	public void removeAll() {
		tempCartDao.deleteAll();
		
	}

	@Override
	public List<TempCart> getAll() {
		Iterable<TempCart> itr = tempCartDao.findAll();
		List<TempCart> lst = new ArrayList<TempCart>();
		itr.forEach(ele->lst.add(ele));
		return lst;
	}

	@Override
	public void removeById(int id) {
		tempCartDao.deleteById(id);
		
	}

	

}
