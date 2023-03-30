package com.bookbazaar.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bookbazaar.model.Auther;
import com.bookbazaar.model.Role;

@Repository
public interface RoleDao extends CrudRepository<Role , Integer> {

}
