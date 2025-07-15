package com.example.Zayra.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.Zayra.model.Product;
import com.example.Zayra.service.ProductService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController

public class ProductController {
    @Autowired
    private ProductService productService;

    // @PostMapping("/products")
    // public Product add(@RequestBody Product product) {
    //     return productService.addProduct(product);
    // }

    @GetMapping("/products")
    public List<Product> getAll() {
        return productService.getAllProducts();
    }

    @GetMapping("/products/category")
    public List<Product> getByCategory(@RequestParam String category) {
        return productService.getByCategory(category);
    }

    @GetMapping("/products/gender")
    public List<Product> getByGender(@RequestParam String gender) {
        return productService.getByGender(gender);
    }
}