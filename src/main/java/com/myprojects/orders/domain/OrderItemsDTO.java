package com.myprojects.orders.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderItemsDTO {
	private int id;
	private int orderId;
	private int bookId;
}
