package com.bookbazaar.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.bookbazaar.model.Cart;

@Repository
public interface CartDao extends CrudRepository<Cart, Integer>{

	@Query(value = "select u from Cart u where u.userid = :UserId",nativeQuery=true)
	public List<Cart> findByUserId(@Param(value = "UserId") int UserId);
}
