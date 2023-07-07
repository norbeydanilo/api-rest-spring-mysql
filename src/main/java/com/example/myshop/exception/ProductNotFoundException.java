package com.example.myshop.exception;

/**
 * Excepción de producto no encontrado
 * 
 * @author --
 * @version 1.0
 */
public class ProductNotFoundException extends RuntimeException {

    public ProductNotFoundException() {
        super();
    }

    public ProductNotFoundException(String message) {
        super(message);
    }

    public ProductNotFoundException(long id) {
        super("Product not found: " + id);
    }
}
