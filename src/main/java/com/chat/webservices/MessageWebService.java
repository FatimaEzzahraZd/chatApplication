package com.chat.webservices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.chat.entities.Message;
import com.chat.iservices.IMessageService;

@RestController
@RequestMapping("/Message")
public class MessageWebService {
	
	
	@Autowired
	private IMessageService service;
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public Message save (@RequestBody Message message) {
		
		return service.saveOrUpdate(message);
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.PUT)
	public Message update (@RequestBody Message message) {
		
		return service.saveOrUpdate(message);
	}
	
	
	@RequestMapping(value = "/getOne/{idMessage}", method = RequestMethod.GET)
	public Message getOne (@PathVariable Long idMessage) {
		
		return service.getOne(idMessage);
	}

	@RequestMapping(value = "/delete/{idMessage}", method = RequestMethod.DELETE)
	public void delete (@PathVariable Long idMessage) {
		service.delete(idMessage);
	}

	@RequestMapping(value = "/getAll", method = RequestMethod.GET)
	public List<Message> getAll () {
		
		return service.getAll();
	}

}
