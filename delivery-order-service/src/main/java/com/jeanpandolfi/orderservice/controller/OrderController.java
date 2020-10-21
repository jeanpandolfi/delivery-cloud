package com.jeanpandolfi.orderservice.controller;

import com.jeanpandolfi.orderservice.exception.ExceptionHandlerController;
import com.jeanpandolfi.orderservice.model.Order;
import com.jeanpandolfi.orderservice.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;
import java.net.URISyntaxException;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/api/orders")
public class OrderController {

    private final OrderService orderService;

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody Order order) throws URISyntaxException {
        return ResponseEntity.created(new URI("/api/orders/" + orderService.save(order).getId() )).build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Order> findById(@PathVariable("id") Integer id){
        return ResponseEntity.ok(orderService.findById(id).get());
    }

    @GetMapping
    public ResponseEntity<Iterable<Order>> findAll(){
        return ResponseEntity.ok().body(orderService.findAll());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") Integer id){
        orderService.delete(id);
        return ResponseEntity.ok().build();
    }

}
