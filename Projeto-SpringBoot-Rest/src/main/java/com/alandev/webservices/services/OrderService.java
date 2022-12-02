package com.alandev.webservices.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alandev.webservices.entities.Order;
import com.alandev.webservices.entities.Order;
import com.alandev.webservices.rerpositories.OrderRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository repository;

	public List<Order> findAll() {
		return repository.findAll();
	}

	public Order findById(Long id) {
		Optional<Order> obj = repository.findById(id);
		return obj.get();
	}

	public Order update(Long id, Order order) {
		Order entity = repository.getReferenceById(id);
		BeanUtils.copyProperties(order, entity,"id");
		return repository.save(entity);
	}
	
	public Order insert(Order order) {
		return repository.save(order);
	}
	
	public void delete(Long id) {
		repository.deleteById(id);
	}
}
