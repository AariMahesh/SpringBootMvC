package com.kodnest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kodnest.entity.Laptop;
import com.kodnest.service.LaptopService;

@RestController
public class LaptopController {
	@Autowired
	LaptopService ls;
	@GetMapping(value="/laptop")
	public List<Laptop> getLaptop()
	{
		return ls.getLaptop();
	}
	@PostMapping(value="/laptop/post")
	public void postLaptop(@RequestBody Laptop laptop)
	{
		System.out.println(laptop);
		ls.getPost(laptop);
	}
	@DeleteMapping(value="/laptop/delete/{id}")
	public void deleteLaptop(@PathVariable int id)
	{
		ls.deleteLaptop(id);
	}
	@PutMapping(value="/laptop/update/{id}")
	public void updateLaptop(@PathVariable int id,@RequestBody Laptop lap) 
	{
		ls.updateLaptop(id,lap);
	}

}
