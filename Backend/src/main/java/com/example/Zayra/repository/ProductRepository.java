package com.example.Zayra.repository;

import com.example.Zayra.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByCategory (String category);
    List<Product> findByGender (String gender);
    List<Product> findBySize (String size);
    List<Product> findByColor (String color);

}
