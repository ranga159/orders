package com.myprojects.orders.util;

import java.util.List;
import java.util.stream.Collectors;

import com.myprojects.orders.domain.OrderDTO;
import com.myprojects.orders.entity.Orders;

import lombok.experimental.UtilityClass;

@UtilityClass
public class OrderConverter {

	public static List<OrderDTO> convertOrderListToOrderDTOList(List<Orders> orders){
		return orders.stream().map(OrderConverter::convertOrdertoOrderDTO).collect(Collectors.toList());
	}
	
	
	public static OrderDTO convertOrdertoOrderDTO(Orders order) {
		OrderDTO orderDTO = new OrderDTO();
		orderDTO.setId(order.getId());
		// to do
		//orderDTO.set(AuthorConverter.convertAuthorToAuthorDTO(book.getAuthor()));
		orderDTO.setOrderDate(order.getOrder_date());
		orderDTO.setOrderStatus(order.getOrderStatus());
		return orderDTO;
	} 

	
}
