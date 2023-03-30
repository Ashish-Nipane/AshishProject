package com.bookbazaar.model;

import org.springframework.web.multipart.MultipartFile;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int book_Id;
	private String booktitle;
	@ManyToOne
    @JoinColumn(name = "fk_Book_autherId")
	private Auther auther;
	public String getBook_type() {
		return booktype;
	}
	public void setBook_type(String booktype) {
		this.booktype = booktype;
	}
	private String bookgenre;
	private String booklanguage;
	private String bookdesc;
	private String booktype;
	private float bookMRP;
	private float bookprice;
	private String booklocality;
	private String bookimg;
	public String getBook_img() {
		return bookimg;
	}
	public void setBook_img(String bookimg) {
		this.bookimg = bookimg;
	}
	@ManyToOne
    @JoinColumn(name = "fk_Book_userId")
	private User user;
	private String DATETIME;
	public int getBook_Id() {
		return book_Id;
	}
	public void setBook_Id(int book_Id) {
		this.book_Id = book_Id;
	}
	public String getBooktitle() {
		return booktitle;
	}
	public void setBooktitle(String booktitle) {
		this.booktitle = booktitle;
	}
	public Auther getAuther() {
		return auther;
	}
	public void setAuther(Auther auther) {
		this.auther = auther;
	}
	public String getBookgenre() {
		return bookgenre;
	}
	public void setBookgenre(String bookgenre) {
		this.bookgenre = bookgenre;
	}
	public String getBooklanguage() {
		return booklanguage;
	}
	public void setBooklanguage(String booklanguage) {
		this.booklanguage = booklanguage;
	}
	public String getBookdesc() {
		return bookdesc;
	}
	public void setBookdesc(String bookdesc) {
		this.bookdesc = bookdesc;
	}
	public String getBooktype() {
		return booktype;
	}
	public void setBooktype(String booktype) {
		this.booktype = booktype;
	}
	public float getBookMRP() {
		return bookMRP;
	}
	public void setBookMRP(float bookMRP) {
		this.bookMRP = bookMRP;
	}
	public float getBookprice() {
		return bookprice;
	}
	public void setBookprice(float bookprice) {
		this.bookprice = bookprice;
	}
	public String getBooklocality() {
		return booklocality;
	}
	public void setBooklocality(String booklocality) {
		this.booklocality = booklocality;
	}
	public String getBookimg() {
		return bookimg;
	}
	public void setBookimg(String bookimg) {
		this.bookimg = bookimg;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getDATETIME() {
		return DATETIME;
	}
	public void setDATETIME(String dATETIME) {
		DATETIME = dATETIME;
	}
	
	

}
