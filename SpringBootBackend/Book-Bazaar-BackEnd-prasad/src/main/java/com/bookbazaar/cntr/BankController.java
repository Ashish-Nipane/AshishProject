package com.bookbazaar.cntr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bookbazaar.model.Bank;
import com.bookbazaar.service.BankService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class BankController {
	@Autowired
	private BankService bankService;
	@PostMapping(value = {"/Addbank"}) 
	public String userBank(@RequestBody Bank bank) {
		bankService.addBank(bank);
		return "success";
	}
	
	@PostMapping(value = {"/updateBank"}) 
	public String bankModify(@RequestBody Bank bank) {
		bankService.modifyBank(bank);
		return "success";
	}
	
	@GetMapping(value = {"/Bank/{fk_bank_user1_id}"})
	public Bank bankGet(@PathVariable int fk_bank_user1_id) {
		return bankService.getByFk_bank_user1_id(fk_bank_user1_id);
	}
	@DeleteMapping(value = {"/DeleteBank/{Bank_id}"})
	public String productDelete1(@PathVariable int Bank_id) {
		bankService.removeByBank_id(Bank_id);
		return "success";
	}

}
