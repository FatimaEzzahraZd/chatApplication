package com.chat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.chat.entities.User;
import com.chat.repositories.IUserRepository;

@SpringBootApplication
public class ChatApplication implements CommandLineRunner{

	public static void main(String[] args){
		SpringApplication.run(ChatApplication.class, args);
	}

	@Autowired
	private IUserRepository repo;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		User u = new User("fa", "ezz", "image");
		repo.save(u);
		
	}

}
