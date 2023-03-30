package com.bookbazaar.cntr;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.bookbazaar.model.TempCart;
import com.bookbazaar.service.TempCartService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class TempCartController {
	@Autowired
	private TempCartService tempCartService;
	@PostMapping(value = {"/tempcart"}) 
	public String addTemp(@RequestBody TempCart tempCart) {
		tempCartService.addTempCart(tempCart);
		return "success";
	}
	@GetMapping(value = {"/tempcartList"})
	public List<TempCart> cartList(){
		return tempCartService.getAll();
	}
	@DeleteMapping(value = {"/DeleteList"})
	public String listDelete1() {
		tempCartService.removeAll();
		return "success";
	}
	@DeleteMapping(value = {"/deletetempcartbyidList/{id}"})
	public String listDelete2(@PathVariable int id) {
		tempCartService.removeById(id);
		return "success";
	}

}
