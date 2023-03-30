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
public class OrderBook {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int orderBook_id;
	private String order_date;
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_OrderBook_Address1_id")
	private Address address;
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_OrderBook_User1_id")
	private User user;
	private float shiping_cost;
	private float total_amt;
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_OrderBook_Book1_id")
	private Book book;
	public int getOrderBook_id() {
		return orderBook_id;
	}
	public void setOrderBook_id(int orderBook_id) {
		this.orderBook_id = orderBook_id;
	}
	public String getOrder_date() {
		return order_date;
	}
	public void setOrder_date(String order_date) {
		this.order_date = order_date;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public float getShiping_cost() {
		return shiping_cost;
	}
	public void setShiping_cost(float shiping_cost) {
		this.shiping_cost = shiping_cost;
	}
	public float getTotal_amt() {
		return total_amt;
	}
	public void setTotal_amt(float total_amt) {
		this.total_amt = total_amt;
	}
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	
	

}
