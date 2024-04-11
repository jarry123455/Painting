package com.pant.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pant.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
