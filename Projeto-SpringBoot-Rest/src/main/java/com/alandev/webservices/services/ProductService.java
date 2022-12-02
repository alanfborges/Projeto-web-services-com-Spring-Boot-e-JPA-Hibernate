package com.alandev.webservices.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alandev.webservices.entities.Product;
import com.alandev.webservices.entities.Product;
import com.alandev.webservices.rerpositories.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository repository;

	public List<Product> findAll() {
		return repository.findAll();
	}

	public Product findById(Long id) {
		Optional<Product> obj = repository.findById(id);
		return obj.get();
	}

	public Product insert(Product product) {
		return repository.save(product);
	}
	
	public void delete(Long id) {
		repository.deleteById(id);
	}
	
	public Product update(Long id, Product product) {
		Product entity = repository.getReferenceById(id);
		BeanUtils.copyProperties(product, entity,"id");
		return repository.save(entity);
	}
}
