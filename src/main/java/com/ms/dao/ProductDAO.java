package com.ms.dao;

import java.util.List;

import com.ms.entity.Product;
import com.ms.model.ProductPriceModel;

public interface ProductDAO {
	public Product save(Product product);
	public Product update(Product product);
	public Product deleteById(int id);
	public Product findById(int id);
	public List<Product> findAll();
	public List<ProductPriceModel> findAllPriceList();
	public List<Product> findByBrand(String brand);
	public List<Product> findByPriceRange(int low, int high);
}
