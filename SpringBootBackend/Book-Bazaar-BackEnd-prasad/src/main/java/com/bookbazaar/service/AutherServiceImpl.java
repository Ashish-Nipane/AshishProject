package com.bookbazaar.service;

import java.util.ArrayList;
import java.util.List;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookbazaar.dao.AutherDao;
import com.bookbazaar.model.Auther;

@Service
public class AutherServiceImpl implements AutherService{
	@Autowired
	private AutherDao autherDao;

	@Override
	public void addAuther(Auther auther) {
		autherDao.save(auther);
		
	}

	@Override
	public void modify(Auther auther) {
		autherDao.save(auther);
		
	}

	@Override
	public void removeById(int autherId) {
		autherDao.deleteById(autherId);
		
	}

	@Override
	public Auther getById(int autherId) {
		Optional<Auther> opt = autherDao.findById(autherId);
		if(opt.isPresent()) {
			return opt.get();
		}
		return null;
	}

	@Override
	public List<Auther> getAll() {
		Iterable<Auther> itr = autherDao.findAll();
		List<Auther> lst = new ArrayList<Auther>();
		itr.forEach(ele->lst.add(ele));
		System.out.println("brand");
		return lst;
	}

}
