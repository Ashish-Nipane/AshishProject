package com.bookbazaar.cntr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bookbazaar.model.Payment;
import com.bookbazaar.model.Role;
import com.bookbazaar.service.PaymentService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class PaymentController {
	@Autowired
	private PaymentService paymentService;
	@PostMapping(value = {"/Payment"}) 
	public String addPayment(@RequestBody Payment payment) {
		paymentService.addPayment(payment);
		return "success";
	}
	

}
