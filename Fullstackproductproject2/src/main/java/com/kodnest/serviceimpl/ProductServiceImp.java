package com.kodnest.serviceimpl;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kodnest.entity.Product;
import com.kodnest.entity.Student;
import com.kodnest.repository.*;
import com.kodnest.service.*;
@Service
public class ProductServiceImp implements ProductService {
 @Autowired
 ProductRepository pr;
	@Override
	public List<Product> getProduct() {
		// TODO Auto-generated method stub
		return pr.findAll();
	}
	@Override
	public Product getProductById(int id) {
		// TODO Auto-generated method stub
		Optional<Product> product=pr.findById(id);
		return product.orElse(null);
	}
	@Override
	public void getPost(Product product) {
		// TODO Auto-generated method stub
		pr.save(product);
		
	}
	@Override
	public void deleteProduct(int id) {
		// TODO Auto-generated method stub
		pr.deleteById(id);
	}
	@Override
	public void updateProduct(int id, Product upPrd) {
		// TODO Auto-generated method stub
		Optional<Product> existPrd=pr.findById(id);
		if(existPrd.isPresent())
		{
			Product pd=existPrd.get();
			pd.setPname(upPrd.getPname());
			pr.save(pd);
			
		}
		
	}
	
	

}
