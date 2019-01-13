package com.myprojects.orders.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myprojects.orders.entity.OrderItems;

public interface OrderItemsRepository extends JpaRepository<OrderItems, Long>{

}
