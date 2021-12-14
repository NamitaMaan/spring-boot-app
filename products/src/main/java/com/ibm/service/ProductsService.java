package com.ibm.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ibm.model.Products;
import com.ibm.repository.ProductsRepository;
import com.ibm.exception.ProductsNotFoundException;
import com.ibm.exception.IdnotMatchException;

@Service
public class ProductsService {
	@Autowired
	ProductsRepository productsRepo;
	
		
	public List<Products> getProducts() {
		return productsRepo.findAll();
	}
	
	public Products getProductById(int id) {
		return productsRepo.findById(id).orElseThrow(ProductsNotFoundException::new);
	}
	
	public Products createProducts(Products products) {
		Products result = productsRepo.save(products);
		return result;
	}
	
	public boolean deleteProducts(int id) {
		Products result = getProductById(id);
		productsRepo.delete(result);
		return true;
	}
	
	public boolean updateProducts(int id, Products products) {
		if (id == products.getProductId()){
			getProductById(id);
			productsRepo.save(products);
			return true;
		} else {
			throw new IdnotMatchException();
		}
	}
	
}