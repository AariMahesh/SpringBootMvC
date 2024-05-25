package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

//import org.junit.jupiter.api.ClassOrderer.OrderAnnotation;
//import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.TestMethodOrder;
//import org.junit.jupiter.api.TestMethodOrder.*;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.example.demo.controller.CountryController;
import com.example.demo.entity.Country;
import com.example.demo.service.CountryService;
//@TestMethodOrder(OrderAnnotation.class)
@SpringBootTest(classes= {ControllerMokitoTest.class})
public class ControllerMokitoTest {
	@Mock
	CountryService cs;
	@InjectMocks
	CountryController cc;
	List<Country> mc;
	Country c;
	@Test
	@Order(1)
	public void test_getAllCountries()
	{
		mc=new ArrayList<Country>();
		mc.add(new Country(1,"india","Delhi"));
		mc.add(new Country(2,"india","Delhi"));
		when(cs.getAllCountries()).thenReturn(mc);
		ResponseEntity<List<Country>> res=cc.getCountries();
		assertEquals(HttpStatus.FOUND,res.getStatusCode());
		assertEquals(2,res.getBody().size());
	}

}
