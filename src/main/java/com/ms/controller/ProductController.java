package com.ms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ms.entity.Product;
import com.ms.service.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {

	@Autowired
	private ProductService productService;
	
	//@PostMapping
	public void saveProduct(Product product) {
	}

	//@PutMapping
	public void updateProduct(Product product) {

	}
	//@DeleteMapping
	public void deleteProductById(int id) {
		
	}
	//@GetMapping
	public void findProductById(int id) {
		
	}
	
	@GetMapping(produces = "application/json")
	public List<Product> findAllProducts() {
		List<Product> products=productService.findAll();
		return products;
	}
	//@GetMapping
	public void findAllProductsByBrand() {
		
	}
	//@GetMapping
	public void findAllProductsByPriceRange() {
		
	}
}
