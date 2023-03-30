package com.bookbazaar.service;

import java.util.List;
import com.bookbazaar.model.Book;

public interface BookService {
	void addBook(Book book);
	void modify(Book book);
	void removeByBook_Id(int book_Id);
	Book getByBook_Id(int book_Id);
	List<Book> getAll();
	List<Book> getBylike(String s);
	List<Book> getByGenre(String s);
	List<String> selectDistinctGenre();
//	List<Book> getAllByTitle(String title);
//	List<Book> getAllByCatagory(String catagory);
//	List<Book> getAllByGenre(String genre);
//	List<Book> getByPrice(float price);
//	List<Book> getByLanguage(String language);
//	List<Book> getByDescContaining(String input);
//	List<Book> getByLocality(String locality);
//	List<Book> getByUserId(int userId);
}
