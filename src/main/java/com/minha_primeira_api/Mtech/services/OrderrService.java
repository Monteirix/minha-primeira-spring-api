package com.minha_primeira_api.Mtech.services;

import com.minha_primeira_api.Mtech.entities.Order;
import com.minha_primeira_api.Mtech.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderrService {

    @Autowired
    OrderRepository repository;

    public List<Order> findAll(){
       return repository.findAll();
    }
    public Order findById(Long id){
       Optional<Order> obj = repository.findById(id);
       return obj.get();
    }
}
