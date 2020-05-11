package com.chat.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chat.entities.User;
import com.chat.iservices.IUserService;
import com.chat.repositories.IUserRepository;

@Service
public class UserService implements IUserService {

	@Autowired
	private IUserRepository repo;
	@Override
	public User saveOrUpdate(User user) {
		return repo.save(user);
	}

	@Override
	public List<User> getAll() {
		return repo.findAll();
	}

	@Override
	public User getOne(Long idUser) {
		return repo.findById(idUser).get();
	}

	@Override
	public void delete(Long idUser) {
         repo.deleteById(idUser);		
	}



	
	

}
