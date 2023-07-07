package com.example.myshop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.myshop.domain.Product;
import com.example.myshop.exception.ProductNotFoundException;
import com.example.myshop.repository.ProductRepository;

import java.util.Optional;
import java.util.Set;

/**
 * Implementación del Service de productos
 * 
 * @author --
 * @version 1.0
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public Set<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public Set<Product> findByCategory(String category) {
        return productRepository.findByCategory(category);
    }

    @Override
    public Optional<Product> findById(long id) {
        return productRepository.findById(id);
    }

    @Override
    public Product addProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Product modifyProduct(long id, Product newProduct) {
        Product product = productRepository.findById(id)
                .orElseThrow(() -> new ProductNotFoundException(id));
        newProduct.setId(product.getId());
        return productRepository.save(newProduct);
    }

    @Override
    public void deleteProduct(long id) {
        productRepository.findById(id)
                .orElseThrow(() -> new ProductNotFoundException(id));
        productRepository.deleteById(id);
    }
}
