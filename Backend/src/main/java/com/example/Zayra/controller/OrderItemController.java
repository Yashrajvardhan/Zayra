package com.example.Zayra.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Zayra.model.OrderItem;
import com.example.Zayra.service.OrderItemService;
@CrossOrigin(origins = "http://localhost:4200")
@RestController

public class OrderItemController {

    @Autowired
    private OrderItemService orderItemService;

    @PostMapping("/order-items")
    public OrderItem addOrderItem(@RequestBody OrderItem orderItem) {
        return orderItemService.addOrderItem(orderItem);
    }

    @GetMapping("/order-items/order/{orderId}")
    public List<OrderItem> getItemsByOrder(@PathVariable Long orderId) {
        return orderItemService.getItemsByOrderId(orderId);
    }
}