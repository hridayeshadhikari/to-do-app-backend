package com.todolist.webapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.todolist.webapp.entity.Entities;
import com.todolist.webapp.service.MyService;

@RestController
@RequestMapping("/to-do")
public class MyController {
	
	@Autowired
	private MyService myService;
	@GetMapping("/home")
	public String home() {
		return "index";
	}
	
	@GetMapping("/get-all-items")
	List<Entities> getAllItems(){
		return myService.getAllItems(); 
	}
	
	@PostMapping("/post")
	public void postItem(@RequestBody Entities entities) {
		myService.postItem(entities);
	}
	@GetMapping("/get-all-items/{id}")
	public Entities getItemsById(@PathVariable Long id) {
		return myService.getItemsById(id);
	}
	
	@DeleteMapping("get-all-items/{id}")
	public String deleteById(@PathVariable Long id) {
		myService.deleteById(id);
		return "Deleted Successfully";
	}
	
	@PutMapping("/get-all-items")
	public Entities updateItem(@RequestBody Entities entities) {
		return myService.updateItem(entities);
	}
	
	 
	
}
