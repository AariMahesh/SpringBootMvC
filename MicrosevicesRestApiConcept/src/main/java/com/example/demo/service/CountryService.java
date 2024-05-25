package com.example.demo.service;
import com.example.demo.repository.*;
//import java.util.ArrayList;
//import java.util.HashMap;
import java.util.List;
//import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Country;
@Service
public class CountryService {
	//data can be retrived in two ways 1.by constructor 2.by autowired with bd
	//2.by autowired with table
	@Autowired
	CountryRepository cr;

	public List<Country> getAllCountries() {
		// TODO Auto-generated method stub
		return cr.findAll();
	}

	public Country getAllCounttriesById(int id) {
		// TODO Auto-generated method stub
		return cr.findById(id).get();
	}

	public Country getAllCounttriesByName(String name) {
		// TODO Auto-generated method stub
		List<Country> c=cr.findAll();
		Country co=null;
		for(Country c1:c)
		{
			if(c1.getCname().equals(name))
			{
				co=c1;
			}
		}
		return co;
	}

	public Country addCountry(Country c) {
		// TODO Auto-generated method stub
		return cr.save(c);
	}

	public Country updateCountry(Country c) {
		// TODO Auto-generated method stub
		if(cr.findAll().size()>0)
		{
			return cr.save(c);
		}
		return null;
	}

	public void deleteCountry(Country country) {
		// TODO Auto-generated method stub
		//Country c=cr.findById(id).get();
		cr.delete(country);
		//return c;
	}

	//1.by constructor
//	static HashMap<Integer,Country> countryIdMap;
//	public CountryService()
//	{
//		countryIdMap=new HashMap<>();
//		Country c1=new Country(1,"India","delhi");
//		countryIdMap.put(1, c1);
//		Country c2=new Country(2,"India","delhi");
//		Country c3=new Country(3,"India","delhi");
//		Country c4=new Country(4,"India","delhi");
//		countryIdMap.put(2, c2);
//		countryIdMap.put(3, c3);
//		countryIdMap.put(4, c4);
//	}
//	public List<Country> getAllCountries()
//	{
//		List<Country> countries=new ArrayList<>(countryIdMap.values());
//		return countries;
//		
//	}
//	public Country getAllCounttriesById(int id)
//	{
//		
//		Country country=countryIdMap.get(id);
//		return country;
//	}
//	public Country getAllCounttriesByName(String Name)
//	{
//		
//		Country country=null;
//		for(int i:countryIdMap.keySet())
//		{
//			if(countryIdMap.get(i).getCname().equals(Name))
//			{
//				country=countryIdMap.get(i);
//			}
//			
//		}
//		return country;
//	}
//	public Country addCountry(Country c)
//	{
//		c.setCid(getMaxId());
//		countryIdMap.put(c.getCid(), c);
//		return c;
//	}
//	public int getMaxId()
//	{
//		int max=0;
//		for(int i:countryIdMap.keySet())
//		{
//			if(max<=i)
//			{
//				max=i;
//			}
//		}
//		return max+1;
//	}
//	public Country updateCountry(Country c)
//	{
//		if(c.getCid()>0)
//		{
//			countryIdMap.put(c.getCid(), c);
//		}
//		
//		return c;
//	}
//	public Country deleteCountry(int id)
//	{
//		
//		return countryIdMap.remove(id);
//	}
//	

}
