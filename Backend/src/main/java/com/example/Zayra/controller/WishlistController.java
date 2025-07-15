package com.example.Zayra.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Zayra.model.User;
import com.example.Zayra.model.Wishlist;
import com.example.Zayra.service.WishlistService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController

public class WishlistController {
    @Autowired
    private WishlistService wishlistService;

    @PostMapping("/wishlist/add")
    public Wishlist add(@RequestBody Wishlist wishlist) {
        return wishlistService.addToWishlist(wishlist);
    }

    @GetMapping("/wishlist/user")
    public List<Wishlist> getUserWishlist(@RequestBody User user) {
        return wishlistService.getWishlistByUser(user);
    }
}