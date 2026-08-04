package com.minha_primeira_api.Mtech.repositories;

import com.minha_primeira_api.Mtech.entities.Category;
import com.minha_primeira_api.Mtech.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {


}
