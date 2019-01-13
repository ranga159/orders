package com.myprojects.orders.domain;

import java.time.LocalDate;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderDTO {
 private Long id;
 private LocalDate orderDate;
 private String orderStatus;
 private List<OrderItemsDTO> orderItemsDTO;
}
