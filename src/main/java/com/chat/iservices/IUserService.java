package com.chat.iservices;

import java.util.List;

import com.chat.entities.User;

public interface IUserService {
	
	public User saveOrUpdate (User user);
	
	public List<User> getAll();
	
	public User getOne (Long idUser);
	
	public void delete (Long idUser);
	

}
