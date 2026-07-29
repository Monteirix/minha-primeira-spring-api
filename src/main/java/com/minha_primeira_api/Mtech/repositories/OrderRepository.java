package com.minha_primeira_api.Mtech.repositories;

import com.minha_primeira_api.Mtech.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository  extends JpaRepository<Order, Long> {
}
