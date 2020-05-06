package com.chat.iservices;

import java.util.List;

import com.chat.entities.Discussion;

public interface IDiscussionService {
	
	public Discussion saveOrUpdate (Discussion discussion);
	
	public List<Discussion> getAll();
	
	public Discussion getOne(Long idDiscussion);
	
	public void delete (Long idDiscussion);

}
