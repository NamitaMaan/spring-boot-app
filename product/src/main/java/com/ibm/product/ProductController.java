package com.ibm.product;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.product.model.Product;

@RestController
@RequestMapping("/Product")
public class ProductController {

	@RequestMapping("/{prodId}")
	public Product getProduct(@PathVariable("prodId") String prodId){
	
		System.out.println("enter value for:::"+prodId);
		Product prod1 = new Product("P001", "Vegetable Oil", "5L", 1400.50, 1);
		Product prod2 = new Product("P002", "Coffee", "100gms", 200.00, 2);
		Product prod3 = new Product("P003", "Fries","800gms", 750.00, 3);
		Product prod4 = new Product("P004", "Tea","1kg", 800.00, 1);
		Product prod = new Product();
		
		switch(prodId) {
		case("1") : prod = prod1; break;
		case("2") : prod = prod2; break; 
		case("3") : prod = prod3; break;
		case("4") : prod = prod4; break;
		}
		
		System.out.println("returning value for::"+prodId);
		return prod;
	}
	
}	
