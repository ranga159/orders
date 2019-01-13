package com.myprojects.orders.entity;

import java.time.LocalDate;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.Getter;
import lombok.Setter;

@Entity(name = "Orders")
@Table(name = "orders")
@Getter
@Setter
@EntityListeners(AuditingEntityListener.class)
public class Orders extends BaseEntity{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private LocalDate order_date;
	private String orderStatus;
	@OneToMany(mappedBy = "orders", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<OrderItems> orderItems;
}
