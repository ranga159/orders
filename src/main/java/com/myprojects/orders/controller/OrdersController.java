package com.myprojects.orders.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myprojects.orders.domain.OrderDTO;
import com.myprojects.orders.service.OrdersService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class OrdersController {
	
	private OrdersService orderService;
	
	@GetMapping(value="/orders")
	public List<OrderDTO> getListOfAllOrders(){
		return orderService.getAllOrders();
	}

}
