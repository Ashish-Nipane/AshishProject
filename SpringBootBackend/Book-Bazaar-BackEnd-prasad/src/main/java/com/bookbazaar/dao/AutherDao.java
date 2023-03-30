package com.bookbazaar.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bookbazaar.model.Auther;

@Repository
public interface AutherDao extends CrudRepository<Auther , Integer> {

}
