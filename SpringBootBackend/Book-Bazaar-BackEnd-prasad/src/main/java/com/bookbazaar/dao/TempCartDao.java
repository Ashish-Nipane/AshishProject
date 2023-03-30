package com.bookbazaar.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.bookbazaar.model.TempCart;

@Repository
public interface TempCartDao extends CrudRepository<TempCart, Integer>{

}
