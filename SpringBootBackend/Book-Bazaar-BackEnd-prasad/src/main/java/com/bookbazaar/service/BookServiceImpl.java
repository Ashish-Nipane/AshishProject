package com.bookbazaar.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookbazaar.dao.BookDao;
import com.bookbazaar.model.Book;
@Service
public class BookServiceImpl implements BookService {
	@Autowired
	private BookDao bookDao;

	@Override
	public void addBook(Book book) {
		bookDao.save(book);
	}

	@Override
	public void modify(Book book) {
		bookDao.save(book);
		
	}

	@Override
	public void removeByBook_Id(int book_Id) {
		bookDao.deleteById(book_Id);
		
	}

	@Override
	public Book getByBook_Id(int book_Id) {
		Optional<Book> opt = bookDao.findById(book_Id);
		if(opt.isPresent()) {
			return opt.get();
		}
		return null;
	}

	@Override
	public List<Book> getAll() {
		Iterable<Book> itr = bookDao.findAll();
		List<Book> lst = new ArrayList<Book>();
		itr.forEach(ele->lst.add(ele));
		System.out.println("brand");
		return lst;
	}

	@Override
	public List<String> selectDistinctGenre() {
		
		return bookDao.findDistinctGenre();
	}

	@Override
	public List<Book> getBylike(String s) {
		Iterable<Book> itr = bookDao.findByBookdescContains(s);
		List<Book> lst = new ArrayList<Book>();
		itr.forEach(ele->lst.add(ele));
		System.out.println("brand");
		return lst;
	}

	@Override
	public List<Book> getByGenre(String s) {
		Iterable<Book> itr = bookDao.findByBookgenre(s);
		List<Book> lst = new ArrayList<Book>();
		itr.forEach(ele->lst.add(ele));
		System.out.println("brand");
		return lst;
	}

	

//	@Override
//	public List<Book> getAllByTitle(String title) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public List<Book> getAllByCatagory(String catagory) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public List<Book> getAllByGenre(String genre) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public List<Book> getByPrice(float price) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public List<Book> getByLanguage(String language) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public List<Book> getByDescContaining(String input) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public List<Book> getByLocality(String locality) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public List<Book> getByUserId(int userId) {
//		// TODO Auto-generated method stub
//		return null;
//	}

}
