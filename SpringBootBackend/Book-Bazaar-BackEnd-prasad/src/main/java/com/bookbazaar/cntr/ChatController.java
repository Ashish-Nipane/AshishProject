package com.bookbazaar.cntr;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.bookbazaar.model.Chat;
import com.bookbazaar.service.ChatService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class ChatController {
	@Autowired
	private ChatService chatService;
	
	@PostMapping(value = {"/chat"}) 
	public String addTemp(@RequestBody Chat chat) {
		Date date = new Date();
		chat.setTimeStamp(date.toString());
		chatService.addChat(chat);
		return "success";
	}
	@GetMapping(value = {"chatList"})
	public List<Chat> chatList(@PathVariable int id){
		return chatService.getAll(id);
	}
	@GetMapping(value = {"chatListAll"})
	public List<Chat> chatList(){
		return chatService.getAllList();
	}
	

}
