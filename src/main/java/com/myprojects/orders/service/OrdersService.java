package com.myprojects.orders.service;

import java.util.List;

import com.myprojects.orders.domain.OrderDTO;

public interface OrdersService {

	List<OrderDTO> getAllOrders();
	
}
