package com.bookbazaar.service;

import java.util.List;

import com.bookbazaar.model.Auther;

public interface AutherService {
	void addAuther(Auther auther);
	void modify(Auther auther);
	void removeById(int autherId);
	Auther getById(int autherId);
	List<Auther> getAll();
	
}
