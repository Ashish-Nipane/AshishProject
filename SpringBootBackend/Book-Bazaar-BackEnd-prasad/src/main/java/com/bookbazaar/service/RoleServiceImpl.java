package com.bookbazaar.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookbazaar.dao.RoleDao;
import com.bookbazaar.model.Role;
@Service
public class RoleServiceImpl implements RoleService{
	@Autowired
	private RoleDao roleDao;

	@Override
	public void addRole(Role role) {
		roleDao.save(role);
		
	}

}
