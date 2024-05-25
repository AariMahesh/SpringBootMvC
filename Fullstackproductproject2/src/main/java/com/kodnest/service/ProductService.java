package com.kodnest.service;

import java.util.List;
import com.kodnest.entity.*;

public interface ProductService {
	List<Product> getProduct();

	Product getProductById( int id);

	void getPost(Product product);

	void deleteProduct(int id);

	void updateProduct(int id, Product prd);

}
