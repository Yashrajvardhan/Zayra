package com.example.Zayra.repository;

import com.example.Zayra.model.User;
import com.example.Zayra.model.Wishlist;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface WishlistRepository extends JpaRepository<Wishlist, Long> {
List<Wishlist> findByUser(User user);
}
