package com.chat.webservices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.chat.entities.User;
import com.chat.iservices.IUserService;

@RestController
@RequestMapping("/User")
@CrossOrigin("*")
public class UserWebService {
	
	
	@Autowired
	private IUserService service;
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public User save (@RequestBody User user) {
		
		return service.saveOrUpdate(user);
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.PUT)
	public User update (@RequestBody User user) {
		
		return service.saveOrUpdate(user);
	}
	
	
	@RequestMapping(value = "/getOne/{idUser}", method = RequestMethod.GET)
	public User getOne (@PathVariable Long idUser) {
		
		return service.getOne(idUser);
	}

	@RequestMapping(value = "/delete/{idUser}", method = RequestMethod.DELETE)
	public void delete (@PathVariable Long idUser) {
		
		service.delete(idUser);
	}

	@RequestMapping(value = "/getAll", method = RequestMethod.GET)
	public List<User> getAll () {
		
		return service.getAll();
	}

}
