package com.chat.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chat.entities.User;

public interface IUserRepository extends JpaRepository<User, Long>{

}
