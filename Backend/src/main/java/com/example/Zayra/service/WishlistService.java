package com.example.Zayra.service;

import com.example.Zayra.model.User;
import com.example.Zayra.model.Wishlist;
import com.example.Zayra.repository.WishlistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WishlistService {
    @Autowired
    private WishlistRepository wishlistRepository;

    public Wishlist addToWishlist(Wishlist wishlist) {
        return wishlistRepository.save(wishlist);
    }

    public List<Wishlist> getWishlistByUser(User user) {
        return wishlistRepository.findByUser(user);
    }
}