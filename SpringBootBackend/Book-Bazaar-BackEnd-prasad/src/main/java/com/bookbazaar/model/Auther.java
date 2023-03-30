package com.bookbazaar.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Auther {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int autherId;
	private String autherName;
	private String country;
	public int getId() {
		return autherId;
	}
	public void setId(int autherId) {
		this.autherId = autherId;
	}
	public String getAutherName() {
		return autherName;
	}
	public void setAutherName(String autherName) {
		this.autherName = autherName;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	

}
