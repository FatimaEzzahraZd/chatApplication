package com.chat.iservices;

import java.util.List;

import com.chat.entities.Message;

/**
 * @author FatimaEzzahraZD
 *
 */
public interface IMessageService {
	
public Message saveOrUpdate (Message message);
	
	public List<Message> getAll();
	
	public Message getOne(Long idMessage);
	
	public void delete (Long idMessage);	

}
