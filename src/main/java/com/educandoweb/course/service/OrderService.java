package com.educandoweb.course.service;


import com.educandoweb.course.entities.Order;
import com.educandoweb.course.entities.User;
import com.educandoweb.course.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final OrderRepository orderRepository;

    public List<Order> findAll(){
        return orderRepository.findAll();
    }


    public Order findById(Long id){
        Optional<Order> order = orderRepository.findById(id);
        return order.get();
    }


}
