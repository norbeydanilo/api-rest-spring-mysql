package com.example.myshop.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.myshop.domain.Product;

import java.util.Set;

/**
 * Repositorio de productos
 * 
 * @author --
 * @version 1.0
 */
public interface ProductRepository extends CrudRepository<Product, Long> {
    Set<Product> findAll();

    Product findByName(String name);

    Set<Product> findByCategory(String category);

    Set<Product> findByNameAndPrice(String name, float price);
}
