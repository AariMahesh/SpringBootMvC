package com.example.demo.controller;

import java.util.List;
//import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.Country;
import com.example.demo.service.CountryService;

@RestController
public class CountryController {
	@Autowired
	CountryService cs;
	@GetMapping("/getCountries")
	public ResponseEntity<List<Country>> getCountries()
	{
		try
		{
			List<Country> countries=cs.getAllCountries();
			return new ResponseEntity<List<Country>>(countries,HttpStatus.FOUND);
			
		}
		catch(Exception e)
		{
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	@GetMapping(value="/getCountries/{id}")
	public ResponseEntity<Country> getById(@PathVariable int id)
	{
		try
		{
			Country c=cs.getAllCounttriesById(id);
			return new ResponseEntity<Country>(c,HttpStatus.OK);
		}
		catch(Exception e)
		{
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	@GetMapping(value="/getCountries/getByName")
	public Country getByName(@RequestParam(value="name") String name)
	{
		return cs.getAllCounttriesByName(name);
	}
	@PostMapping(value="/addCountry")
	public Country addCountry(@RequestBody Country c)
	{
		return cs.addCountry(c);
	}
	@PutMapping(value="/updateCountry")
	public Country updateCountry(@RequestBody Country c)
	{
		return cs.updateCountry(c);
	}
	@DeleteMapping(value="/deleteCountry")
	public void deleteCountry(@RequestBody Country country)
	{
		cs.deleteCountry(country);
	}
	
	

}
