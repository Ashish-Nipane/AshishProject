package com.bookbazaar.cntr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.bookbazaar.model.OrderBook;
import com.bookbazaar.service.OrderBookService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class OrderBookController {
	@Autowired
	private OrderBookService orderBookService;
	@PostMapping(value = {"/orderBook"}) 
	public String addOrderBook(@RequestBody OrderBook orderBook) {
		orderBookService.addOrderBook(orderBook);
		return "success";
	}

}
