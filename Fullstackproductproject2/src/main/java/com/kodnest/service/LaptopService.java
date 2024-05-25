package com.kodnest.service;

import java.util.List;

import com.kodnest.entity.Laptop;

public interface LaptopService {
	public List<Laptop> getLaptop();

	public void getPost(Laptop laptop);

	public void deleteLaptop(int id);

	public void updateLaptop(int id, Laptop lap);

}
