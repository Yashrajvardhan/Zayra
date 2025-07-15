package com.example.Zayra.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;


    private String name;
    private String description;
    private Double price;


    private String category;
    private String gender ;
    private String size;
    private String color;
    private String fabric;



    private String imageUrl;
    private Integer availableStock;
    private Double rating;


}
