package com.kodnest.controller;

import java.util.List;
//import Fullstackproject1.com.kodnest.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kodnest.entity.*;
import com.kodnest.service.ProductService;

@RestController
public class ProductController {
	@Autowired
	ProductService ps;
	
	@GetMapping(value="/products")
	public List<Product> getProduct()
	{
		return ps.getProduct();
	}
	@GetMapping(value="/products/{id}")
	public Product getProductById(@PathVariable int id)
	{
		return ps.getProductById(id);
	}
	@PostMapping(value="/products/post")
	public void getPost(@RequestBody Product product)
	{
		System.out.println(product);
		ps.getPost(product);
	}
	
	@DeleteMapping(value="/product/delete/{id}")
	public void deleteProduct(@PathVariable int id)
	{
		ps.deleteProduct(id);
	}
	@PutMapping(value="/product/put/{id}")
	public void updateProduct(@PathVariable int id,@RequestBody Product prd)
	{
		ps.updateProduct(id,prd);
	}
	
	

}
