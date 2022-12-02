package com.alandev.webservices.rerpositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alandev.webservices.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
