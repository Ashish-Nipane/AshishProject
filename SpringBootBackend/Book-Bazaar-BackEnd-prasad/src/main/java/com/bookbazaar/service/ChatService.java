package com.bookbazaar.service;

import java.util.List;

import com.bookbazaar.model.Chat;

public interface ChatService {
	void addChat(Chat chat);
	List<Chat> getAll(int id);
	List<Chat> getAllList();
	

}
