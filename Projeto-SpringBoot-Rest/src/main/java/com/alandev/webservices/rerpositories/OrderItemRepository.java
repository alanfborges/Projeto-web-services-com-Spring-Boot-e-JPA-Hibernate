package com.alandev.webservices.rerpositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alandev.webservices.entities.OrderItem;
import com.alandev.webservices.entities.User;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
