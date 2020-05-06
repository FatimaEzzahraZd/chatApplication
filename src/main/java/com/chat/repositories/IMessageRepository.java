/**
 * 
 */
package com.chat.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chat.entities.Message;

/**
 * @author FatimaEzzahraZD
 *
 */
public interface IMessageRepository extends JpaRepository<Message, Long>{

}
