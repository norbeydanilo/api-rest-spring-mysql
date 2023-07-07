package com.example.myshop.service;

import java.util.Optional;
import java.util.Set;

import com.example.myshop.domain.Product;

/**
 * Service de productos
 * 
 * @author --
 * @version 1.0
 */
public interface ProductService {

    Set<Product> findAll();

    Set<Product> findByCategory(String category);

    Optional<Product> findById(long id);

    Product addProduct(Product product);

    Product modifyProduct(long id, Product newProduct);

    void deleteProduct(long id);
}
