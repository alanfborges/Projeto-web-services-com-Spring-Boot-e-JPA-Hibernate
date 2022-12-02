package com.alandev.webservices.rerpositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alandev.webservices.entities.Category;
import com.alandev.webservices.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
