package com.example.myshop.domain;

import lombok.*;

import jakarta.persistence.*;
import java.time.LocalDateTime;

/**
 * Producto
 * 
 * @author --
 * @version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private String name;
    @Column
    private String description;
    @Column
    private String category;
    @Column
    private float price;
    @Column(name = "creation_date")
    private LocalDateTime creationDate;
}
