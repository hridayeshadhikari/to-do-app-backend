package com.todolist.webapp.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.todolist.webapp.entity.Entities;
import com.todolist.webapp.repository.MyRepository;

@Service
public class MyService {
	
	@Autowired
	private MyRepository myRepository; 
	
	public List<Entities> getAllItems(){
		return myRepository.findAll();
	}
	
	public void postItem(Entities entities) {
		myRepository.save(entities);
	}
	
	public Entities getItemsById(Long id) {
		return myRepository.findById(id).get();
	}
	
	public void deleteById(Long id) {
		myRepository.deleteById(id);
	}
	public Entities updateItem(Entities entities) {
		return myRepository.save(entities);
	}
	
}
