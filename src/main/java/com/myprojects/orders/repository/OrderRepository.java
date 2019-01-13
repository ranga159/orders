package com.myprojects.orders.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myprojects.orders.entity.Orders;

public interface OrderRepository extends JpaRepository<Orders, Long>{

}
