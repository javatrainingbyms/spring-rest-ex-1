package com.ms.service;

import java.util.List;

import com.ms.entity.Product;

public interface ProductService {
	public Product save(Product product);
	public Product update(Product product);
	public Product deleteById(int id);
	public Product findById(int id);
	public List<Product> findAll();
	public List<Product> findByBrand(String brand);
	public List<Product> findByPriceRange(int low, int high);
}
