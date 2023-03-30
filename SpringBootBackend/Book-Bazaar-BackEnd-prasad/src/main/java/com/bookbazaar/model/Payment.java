package com.bookbazaar.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Data
@Entity
public class Payment {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int payment_id;
	private String payment_mode;
	private String card_upi_no;
	private String payment_amt;
	private String payment_date;
	private String payment_status;
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_Payment_OrderBook1_id")
	private OrderBook orderbook;
	public int getPayment_id() {
		return payment_id;
	}
	public void setPayment_id(int payment_id) {
		this.payment_id = payment_id;
	}
	public String getPayment_mode() {
		return payment_mode;
	}
	public void setPayment_mode(String payment_mode) {
		this.payment_mode = payment_mode;
	}
	public String getCard_upi_no() {
		return card_upi_no;
	}
	public void setCard_upi_no(String card_upi_no) {
		this.card_upi_no = card_upi_no;
	}
	public String getPayment_amt() {
		return payment_amt;
	}
	public void setPayment_amt(String payment_amt) {
		this.payment_amt = payment_amt;
	}
	public String getPayment_date() {
		return payment_date;
	}
	public void setPayment_date(String payment_date) {
		this.payment_date = payment_date;
	}
	public String getPayment_status() {
		return payment_status;
	}
	public void setPayment_status(String payment_status) {
		this.payment_status = payment_status;
	}
	public OrderBook getOrderbook() {
		return orderbook;
	}
	public void setOrderbook(OrderBook orderbook) {
		this.orderbook = orderbook;
	}

}
