package com.example.Zayra.repository;

import com.example.Zayra.model.Order;
import com.example.Zayra.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Long> {
    List<Order> findByUser(User user);


}
