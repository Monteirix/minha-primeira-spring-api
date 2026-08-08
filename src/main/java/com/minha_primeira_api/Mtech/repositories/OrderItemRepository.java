package com.minha_primeira_api.Mtech.repositories;

import com.minha_primeira_api.Mtech.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {


}
