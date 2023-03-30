package com.bookbazaar.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.bookbazaar.model.Chat;

@Repository
public interface ChatDao extends CrudRepository<Chat, Integer>{
	@Query(value = "select s from chat s where s.sender_id = :sender_id",nativeQuery=true)
	public List<Chat> selectBySenderid(@Param(value = "sender_id") int sender_id);
}
