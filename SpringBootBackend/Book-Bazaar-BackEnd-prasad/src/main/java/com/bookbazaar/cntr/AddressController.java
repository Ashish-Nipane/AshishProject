package com.bookbazaar.cntr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bookbazaar.model.Address;
import com.bookbazaar.model.Auther;
import com.bookbazaar.service.AddressService;
import com.bookbazaar.service.AutherService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class AddressController {
	@Autowired
	private AddressService addressService;
	
	@PostMapping(value = {"/addAddress"}) 
	public String autherAdd(@RequestBody Address address) {
		addressService.addAddress(address);
		return "success";
	}

}
