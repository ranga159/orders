package com.myprojects.orders.entity;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.Getter;
import lombok.Setter;

@Entity(name = "OrderItems")
@Table(name = "order_items")
@Getter
@Setter
@EntityListeners(AuditingEntityListener.class)
public class OrderItems extends BaseEntity{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Long bookId;
	@ManyToOne
	@JoinColumn(name="order_id", nullable= false)
	private Orders orders; 
	
}
