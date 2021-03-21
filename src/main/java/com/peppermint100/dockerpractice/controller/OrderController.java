package com.peppermint100.dockerpractice.controller;

import com.peppermint100.dockerpractice.entity.Order;
import com.peppermint100.dockerpractice.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import javax.validation.Valid;

@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private OrderRepository orderRepository;

    @GetMapping(value = "")
    public Iterable<Order> getOrders(){
        return orderRepository.findAll();
    }

    @GetMapping("/{id}")
    public Order getOrder(@PathVariable("id") Long id){
        return orderRepository.findById(id)
                .orElseThrow(() ->
                        new ResponseStatusException(
                                HttpStatus.NOT_FOUND,
                                String.format("No order for id %s", id)));
    }

    @PostMapping("")
    public Order makeOrder(@RequestBody Order order){
        return orderRepository.save(order);
    }
}
