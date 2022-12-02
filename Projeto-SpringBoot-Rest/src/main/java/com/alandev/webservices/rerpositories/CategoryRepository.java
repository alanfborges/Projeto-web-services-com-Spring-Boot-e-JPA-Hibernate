package com.alandev.webservices.rerpositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alandev.webservices.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
