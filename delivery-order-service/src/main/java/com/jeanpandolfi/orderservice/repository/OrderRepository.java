package com.jeanpandolfi.orderservice.repository;

import com.jeanpandolfi.orderservice.model.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, Integer> {
}
