package com.example.Zayra.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Zayra.model.CartItem;
import com.example.Zayra.service.CartItemService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController

public class CartItemController {

    @Autowired
    private CartItemService cartItemService;

    @PostMapping("/cart-items")
    public CartItem addCartItem(@RequestBody CartItem cartItem) {
        return cartItemService.addCartItem(cartItem);
    }

    @GetMapping("/cart-items/cart/{cartId}")
    public List<CartItem> getItemsByCart(@PathVariable Long cartId) {
        return cartItemService.getItemsByCartId(cartId);
    }

    @DeleteMapping("/cart-items/{id}")
    public void deleteItem(@PathVariable Long id) {
        cartItemService.deleteCartItem(id);
    }

    @DeleteMapping("/cart-items/clear/{cartId}")
    public void clearCart(@PathVariable Long cartId) {
        cartItemService.clearCart(cartId);
    }
}