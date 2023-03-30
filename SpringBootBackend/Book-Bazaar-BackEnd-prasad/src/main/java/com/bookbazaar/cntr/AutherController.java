package com.bookbazaar.cntr;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bookbazaar.model.Auther;
import com.bookbazaar.service.AutherService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class AutherController {
	@Autowired
	private AutherService autherService;
	
	@PostMapping(value = {"/addauther"}) 
	public String autherAdd(@RequestBody Auther auther) {
		autherService.addAuther(auther);
		return "success";
	}
	@PutMapping(value = {"/updateauther"})
	public String autherUpdate(@RequestBody Auther auther) {
		autherService.modify(auther);
		return "success";
	}
	@DeleteMapping(value = {"/deleteauther/{autherId}"})
	public String autherDelete(@PathVariable int autherId) {
		System.out.println("first delete");
		autherService.removeById(autherId);
		return "success";
	}
	@GetMapping(value = {"/getauther/{autherId}"})
	public Auther autherGet(@PathVariable int autherId) {
		return autherService.getById(autherId);
	}
	@GetMapping(value = {"/getallauther"})
	public List<Auther> productList(){
		return autherService.getAll();
	}
}
