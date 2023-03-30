package com.bookbazaar.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookbazaar.dao.UserDao;
import com.bookbazaar.model.Book;
import com.bookbazaar.model.User;
@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserDao userDao;
	@Override
	public void addUser(User user) {
		user.setPassword(hashPassword(user.getPassword()));
		userDao.save(user);
		
	}
	// encrypt the password
	static private String hashPassword(String plainTextPassword){
		return BCrypt.hashpw(plainTextPassword, BCrypt.gensalt());
	}

	@Override
	public void modifyUser(User user) {
		userDao.save(user);
		
	}

	@Override
	public User getById(int userId) {
		Optional<User> opt = userDao.findById(userId);
		if(opt.isPresent()) {
			return opt.get();
		}
		return null;
	}

	@Override
	public User getByEmail(String email) {
		
		return userDao.findByEmail(email);
	}

	@Override
	public User getByMobno(String mobno) {
		
		return userDao.findByMobno(mobno);
	}
	@Override
	public void removeById(int id) {
		userDao.deleteById(id); 
		
	}

	@Override
	public List<User> getAll() {
		Iterable<User> itr = userDao.findAll();
		List<User> lst = new ArrayList<User>();
		itr.forEach(ele->lst.add(ele));
		return lst;
	}

}