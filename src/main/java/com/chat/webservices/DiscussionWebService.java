package com.chat.webservices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.chat.entities.Discussion;
import com.chat.iservices.IDiscussionService;

@RestController
@RequestMapping("/Discussion")
@CrossOrigin("*")
public class DiscussionWebService {
	
	
	@Autowired
	private IDiscussionService service;
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public Discussion save (@RequestBody Discussion discussion) {
		
		return service.saveOrUpdate(discussion);
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.PUT)
	public Discussion update (@RequestBody Discussion discussion) {
		
		return service.saveOrUpdate(discussion);
	}
	
	
	@RequestMapping(value = "/getOne/{idDiscussion}", method = RequestMethod.GET)
	public Discussion getOne (@PathVariable Long idDiscussion) {
		
		return service.getOne(idDiscussion);
	}

	@RequestMapping(value = "/delete/{idDiscussion}", method = RequestMethod.DELETE)
	public void delete (@PathVariable Long idDiscussion) {
		service.delete(idDiscussion);
	}

	@RequestMapping(value = "/getAll", method = RequestMethod.GET)
	public List<Discussion> getAll () {
		
		return service.getAll();
	}

}
