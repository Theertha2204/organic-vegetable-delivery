package com.farmfresh.FarmFresh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.farmfresh.FarmFresh.entity.Product;
import com.farmfresh.FarmFresh.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;
	
	public List<Product> getAllProducts()
	{
		return productRepository.findAll();
	}
	
	
	public void saveProduct(Product product)
	{
		productRepository.save(product);
	}
	
	public Product getProductById(Long id)
	{
		return productRepository.findById(id).orElse(null);
	}
}
