package com.example.Zayra.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Zayra.model.CartItem;

public interface CartItemRepository extends JpaRepository<CartItem, Long> {
    List<CartItem> findByCartId(Long cartId);
}
