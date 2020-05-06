package com.chat.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.chat.entities.Discussion;
import com.chat.iservices.IDiscussionService;
import com.chat.repositories.IDiscussionRepository;

@Service
public class DiscussionService implements IDiscussionService {

	private IDiscussionRepository repo;
	@Override
	public Discussion saveOrUpdate(Discussion discussion) {
		return repo.save(discussion);
	}

	@Override
	public List<Discussion> getAll() {
		return repo.findAll();
	}

	@Override
	public Discussion getOne(Long idDiscussion) {
		return repo.findById(idDiscussion).get();
	}

	@Override
	public void delete(Long idDiscussion) {
         repo.deleteById(idDiscussion);		
	}
	
	

}
