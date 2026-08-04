package com.minha_primeira_api.Mtech.services;

import com.minha_primeira_api.Mtech.entities.Product;
import com.minha_primeira_api.Mtech.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    ProductRepository repository;

    public List<Product> findAll(){
       return repository.findAll();
    }
    public Product findById(Long id){
       Optional<Product> obj = repository.findById(id);
       return obj.get();
    }
}
