package com.jeanpandolfi.orderservice.service;

import com.jeanpandolfi.orderservice.model.Order;
import com.jeanpandolfi.orderservice.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import java.util.Optional;

@RequiredArgsConstructor
@Service
public class OrderService {

    private final OrderRepository orderRepository;

    public Order save(@Validated Order order){
        return this.orderRepository.save(order);
    }

    public Optional<Order> findById(Integer id){
        return orderRepository.findById(id);
    }

    public Iterable<Order> findAll(){
        return orderRepository.findAll();
    }

    public void delete(Integer id) {
        orderRepository.deleteById(id);
    }
}
