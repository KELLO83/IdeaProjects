package com.example.spring_fifty_edition.tacos.data;

import com.example.spring_fifty_edition.tacos.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order,Long> { // ORDER REPOSITORY INTERFACE
//    Order save(Order order);
}
