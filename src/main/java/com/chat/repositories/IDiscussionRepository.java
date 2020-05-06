/**
 * 
 */
package com.chat.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chat.entities.Discussion;

/**
 * @author FatimaEzzahraZD
 *
 */
public interface IDiscussionRepository extends JpaRepository<Discussion, Long> {

}
