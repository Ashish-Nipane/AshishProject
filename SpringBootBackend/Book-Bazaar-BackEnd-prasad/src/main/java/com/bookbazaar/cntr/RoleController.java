package com.bookbazaar.cntr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bookbazaar.model.Role;
import com.bookbazaar.model.User;
import com.bookbazaar.service.RoleService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class RoleController {
	@Autowired
	private RoleService roleService;
	@PostMapping(value = {"/role"}) 
	public String roleAdd(@RequestBody Role role) {
		roleService.addRole(role);
		return "success";
	}

}
