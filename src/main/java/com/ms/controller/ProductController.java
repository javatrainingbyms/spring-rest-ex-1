package com.ms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ms.entity.Product;
import com.ms.model.ProductPriceModel;
import com.ms.service.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {

	@Autowired
	private ProductService productService;
	
	@PostMapping(produces="application/json", consumes="application/json")
	public Product saveProduct(@RequestBody Product product) {
		Product p=productService.save(product);
		return p;
	}
	
	
	@GetMapping(value="/{id}",produces="application/json")
	public Product findProductById(@PathVariable("id") int  id) {
		Product product=productService.findById(id);
		return product;
	}
	@GetMapping(value="/pricelist",produces = "application/json")
	public List<ProductPriceModel> findPriceList() {
		List<ProductPriceModel> productPriceModelList=productService.findAllPriceList();
		return productPriceModelList;
	}
	@GetMapping(produces = "application/json")
	public List<Product> findAllProducts() {
		List<Product> products=productService.findAll();
		return products;
	}
	@GetMapping(value="/brand/{brand}",produces="application/json")
	public List<Product> findAllProductsByBrand(@PathVariable("brand") String brand) {
		List<Product> products=productService.findByBrand(brand);
		return products;
	}
	@GetMapping(value="/{low}/{high}", produces="application/json")
	public List<Product> findAllProductsByPriceRange(@PathVariable("low") int  low,@PathVariable("high") int high) {
		List<Product> products=productService.findByPriceRange(low, high);
		return products;
	}
	

		//@PutMapping
		public void updateProduct(Product product) {

		}
		//@DeleteMapping
		public void deleteProductById(int id) {
			
		}
}
