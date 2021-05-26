package com.tatiane.CRUD.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tatiane.CRUD.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
