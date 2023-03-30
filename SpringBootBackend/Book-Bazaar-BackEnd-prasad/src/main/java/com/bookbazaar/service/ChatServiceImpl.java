package com.bookbazaar.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookbazaar.dao.ChatDao;
import com.bookbazaar.model.Chat;
@Service
public class ChatServiceImpl implements ChatService{
	@Autowired
	private ChatDao chatDao;
	

	@Override
	public void addChat(Chat chat) {
		chatDao.save(chat);
		
	}

	@Override
	public List<Chat> getAll(int id) {
		Iterable<Chat> itr = chatDao.findAll();
		List<Chat> lst = new ArrayList<Chat>();
		itr.forEach(ele->lst.add(ele));
		return lst;
	}

	@Override
	public List<Chat> getAllList() {
		Iterable<Chat> itr = chatDao.findAll();
		List<Chat> lst = new ArrayList<Chat>();
		itr.forEach(ele->lst.add(ele));
		return lst;
	}

}
