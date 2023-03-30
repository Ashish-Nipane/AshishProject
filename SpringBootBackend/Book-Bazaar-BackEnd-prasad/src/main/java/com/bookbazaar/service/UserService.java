package com.bookbazaar.service;

import java.util.List;
import com.bookbazaar.model.User;

public interface UserService {
	void addUser(User user);
	void modifyUser(User user);
	User getById(int userId);
	void removeById(int id);
	User getByEmail(String email);
	User getByMobno(String mobno);
	List<User> getAll();

}
