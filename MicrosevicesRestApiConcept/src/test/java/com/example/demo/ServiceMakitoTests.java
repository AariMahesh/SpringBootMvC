package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.ClassOrderer.OrderAnnotation;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.Country;
import com.example.demo.repository.CountryRepository;
import com.example.demo.service.CountryService;
//@TestMethodOrder(OrderAnnotation.class)
@SpringBootTest(classes= {ServiceMakitoTests.class})
public class ServiceMakitoTests {
	@Mock
	CountryRepository cr;
	@InjectMocks
	CountryService cs;
	public List<Country> mycountries;
	@Test
	@Order(1)
	public void test_getAllCountries()
	{
		List<Country> mycountries=new ArrayList<Country>();
		mycountries.add(new Country(1,"india","delhi"));
		mycountries.add(new Country(2,"ap","hyderabad"));
		when(cr.findAll()).thenReturn(mycountries);
		assertEquals(2,cs.getAllCountries().size());
	}
	@Test
	@Order(2)
	public void test_getCountriesById()
	{
		
		List<Country> mycountries=new ArrayList<Country>();
		mycountries.add(new Country(1,"india","delhi"));
		mycountries.add(new Country(2,"ap","hyderabad"));
		int countryId=1;
		when(cr.findAll()).thenReturn(mycountries);
		assertEquals(countryId,cs.getAllCounttriesById(countryId).getCid());
	}
	@Test
	@Order(3)
	public void test_getAllCounttriesByName()
	{
		
		List<Country> mycountries=new ArrayList<Country>();
		mycountries.add(new Country(1,"india","delhi"));
		mycountries.add(new Country(2,"ap","hyderabad"));
		String name="india";
		when(cr.findAll()).thenReturn(mycountries);
		assertEquals(name,cs.getAllCounttriesByName(name).getCname());
	}
	@Test
	@Order(4)
	public void test_addCountry()
	{
		Country mycountries=new Country(1,"india","delhi");
		when(cr.save(mycountries)).thenReturn(mycountries);
		assertEquals(mycountries,cs.addCountry(mycountries));
		
	}
	@Test
	@Order(5)
	public void test_updateCountry()
	{
		Country mycountries=new Country(3,"india","delhi");
		//return object mock statement
		when(cr.save(mycountries)).thenReturn(mycountries);
		assertEquals(mycountries,cs.updateCountry(mycountries));
		
	}
	@Test
	@Order(6)
	public void test_deleteCountry()
	{
		Country mycountries=new Country(3,"india","delhi");
		cs.deleteCountry(mycountries);
		//return void mock statement
		verify(cr,times(1)).delete(mycountries);
	}

}
