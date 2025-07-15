package com.example.Zayra.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Zayra.model.Cart;
import com.example.Zayra.model.User;
import com.example.Zayra.repository.CartRepository;

@Service
public class CartService {
    @Autowired
    private CartRepository cartRepository;

    public Optional<Cart> getCartByUser(User user) {
        return cartRepository.findByUser(user);
    }

    public Cart saveCart(Cart cart) {
        return cartRepository.save(cart);
    }
       public Optional<Cart> getCartByUserId(Long userId) {
        return cartRepository.findByUserId(userId);
    }
}