package com.example.spring_fifty_edition.tacos.data;

import com.example.spring_fifty_edition.tacos.Order;
public interface OrderRepository { // ORDER REPOSITORY INTERFACE
    Order save(Order order);
}
