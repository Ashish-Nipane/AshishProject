package com.bookbazaar.dao;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.bookbazaar.model.User;



@Repository
public interface UserDao extends CrudRepository<User, Integer> {
	public User findByEmail(@Param(value = "email") String email);
	public User findByMobno(@Param(value = "mobno") String mobno);
}
