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

import com.bookbazaar.model.Cart;
import com.bookbazaar.service.CartService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class CartController {
	@Autowired
	private CartService cartService;
	@PostMapping(value = {"/cart"}) 
	public String addTemp(@RequestBody Cart cart) {
		System.out.println(cart.getId());
		cartService.addCart(cart);
		return "success";
	}
	@GetMapping(value = {"/cartList"})
	public List<Cart> cartList(){
		return cartService.getAll();
	}
	@DeleteMapping(value = {"/deletecartList"})
	public String listDelete1() {
		cartService.removeAll();
		return "success";
	}
	@DeleteMapping(value = {"/deletecartbyidList/{id}"})
	public String listDelete2(@PathVariable int id) {
		cartService.removeById(id);
		return "success";
	}

}
