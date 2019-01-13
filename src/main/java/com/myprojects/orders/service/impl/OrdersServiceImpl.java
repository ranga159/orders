package com.myprojects.orders.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.myprojects.orders.domain.OrderDTO;
import com.myprojects.orders.entity.Orders;
import com.myprojects.orders.repository.OrderRepository;
import com.myprojects.orders.service.OrdersService;
import com.myprojects.orders.util.OrderConverter;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class OrdersServiceImpl implements OrdersService{

	private OrderRepository orderRepository;
	
	@Override
	public List<OrderDTO> getAllOrders() {
		List<Orders> orderList = orderRepository.findAll();
		return OrderConverter.convertOrderListToOrderDTOList(orderList);
		
	}

}
