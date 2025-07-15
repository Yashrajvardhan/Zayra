package com.example.Zayra.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Zayra.model.Order;
import com.example.Zayra.model.User;
import com.example.Zayra.service.OrderService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController

public class OrderController {
    @Autowired
    private OrderService orderService;

    @PostMapping("/orders/place")
    public Order place(@RequestBody Order order) {
        return orderService.placeOrder(order);
    }

    @GetMapping("/orders/user")
    public List<Order> getUserOrders(@RequestBody User user) {
        return orderService.getOrdersByUser(user);
    }
}