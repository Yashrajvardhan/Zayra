package com.example.Zayra.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Zayra.model.Cart;
import com.example.Zayra.model.User;
import com.example.Zayra.service.CartService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController

public class CartController {
    @Autowired
    private CartService cartService;

    @PostMapping("/cart")
    public Cart saveCart(@RequestBody Cart cart) {
        return cartService.saveCart(cart);
    }

    @PostMapping("/cart/user")
    public Optional<Cart> getCartByUser(@RequestBody User user) {
        return cartService.getCartByUser(user);
    }
    @GetMapping("/cart/user/{userId}")
    public Optional<Cart> getCartByUserId(@PathVariable Long userId) {
        return cartService.getCartByUserId(userId);
    }
}