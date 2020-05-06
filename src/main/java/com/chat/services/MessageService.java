/**
 * 
 */
package com.chat.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chat.entities.Message;
import com.chat.iservices.IMessageService;
import com.chat.repositories.IMessageRepository;

/**
 * @author FatimaEzzahraZD
 *
 */

@Service
public class MessageService implements IMessageService {

	@Autowired
	private IMessageRepository repo;

	@Override
	public Message saveOrUpdate(Message message) {
		return repo.save(message);
	}

	@Override
	public List<Message> getAll() {
		return repo.findAll();
	}

	@Override
	public Message getOne(Long idMessage) {
		return repo.findById(idMessage).get();
	}

	@Override
	public void delete(Long idMessage) {
		repo.deleteById(idMessage);
	}

}
