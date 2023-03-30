package com.bookbazaar.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Chat {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int sender_id;
	private int recipient_id;
	private String conversation_id;
	private String body;
	private String timeStamp;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSender_id() {
		return sender_id;
	}
	public void setSender_id(int sender_id) {
		this.sender_id = sender_id;
	}
	public int getRecipient_id() {
		return recipient_id;
	}
	public void setRecipient_id(int recipient_id) {
		this.recipient_id = recipient_id;
	}
	
	public String getConversation_id() {
		return conversation_id;
	}
	public void setConversation_id(String conversation_id) {
		this.conversation_id = conversation_id;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public String getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(String timeStamp) {
		this.timeStamp = timeStamp;
	}
	

}
