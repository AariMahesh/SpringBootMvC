package com.kodnest.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kodnest.entity.Laptop;
import com.kodnest.repository.LaptopRepository;
import com.kodnest.service.LaptopService;

@Service
public class LaptopServiceImp implements LaptopService {
	@Autowired
	LaptopRepository lr;
	
	@Override
	public List<Laptop> getLaptop() {
		// TODO Auto-generated method stub
		return lr.findAll();
	}

	@Override
	public void getPost(Laptop laptop) {
		// TODO Auto-generated method stub
		lr.save(laptop);
		
	}

	@Override
	public void deleteLaptop(int id) {
		// TODO Auto-generated method stub
		lr.deleteById(id);
		
	}

	@Override
	public void updateLaptop(int id, Laptop updatelap) {
		// TODO Auto-generated method stub
		Optional<Laptop> existLap=lr.findById(id);
		if(existLap.isPresent())
		{
			Laptop l=existLap.get();
			String s=updatelap.getLapname();
			l.setLapname(s);
			lr.save(l);
		}
		
	}
	

}
