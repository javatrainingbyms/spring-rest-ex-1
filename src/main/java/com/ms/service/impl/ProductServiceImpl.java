package com.ms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ms.dao.ProductDAO;
import com.ms.entity.Product;
import com.ms.service.ProductService;


public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductDAO productDAO;

	@Override
	public Product save(Product product) {
		return productDAO.save(product);
	}

	@Override
	public Product update(Product product) {
		return productDAO.update(product);
	}

	@Override
	public Product deleteById(int id) {
		return productDAO.deleteById(id);
	}

	@Override
	public Product findById(int id) {
		return productDAO.findById(id);
	}

	@Override
	public List<Product> findAll() {
		return productDAO.findAll();
	}

	@Override
	public List<Product> findByBrand(String brand) {
		return productDAO.findByBrand(brand);
	}

	@Override
	public List<Product> findByPriceRange(int low, int high) {
		return productDAO.findByPriceRange(low, high);
	}

}
