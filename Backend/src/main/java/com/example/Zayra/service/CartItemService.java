
package com.example.Zayra.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Zayra.model.CartItem;
import com.example.Zayra.repository.CartItemRepository;

@Service
public class CartItemService {

    @Autowired
    private CartItemRepository cartItemRepository;

    public CartItem addCartItem(CartItem cartItem) {
        return cartItemRepository.save(cartItem);
    }

    public List<CartItem> getItemsByCartId(Long cartId) {
        return cartItemRepository.findByCartId(cartId);
    }

    public void deleteCartItem(Long id) {
        cartItemRepository.deleteById(id);
    }

    public void clearCart(Long cartId) {
        List<CartItem> items = cartItemRepository.findByCartId(cartId);
        cartItemRepository.deleteAll(items);
    }
}