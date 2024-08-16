package com.ecart.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity

@Table(name = "customer_order")
public class Order {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne
	@JoinColumn(name = "customer_id")
	private Customer customer;

	@JsonIgnore
	@OneToMany(mappedBy="order",cascade=CascadeType.ALL)
    private List<Order_Item> items=new ArrayList<>();

	@CreationTimestamp
	private LocalDate orderDate;

	@Enumerated(EnumType.STRING)
	private OrderStatus status;
	
	
	public void addOrderItem(Order_Item orderItem)
	{
		items.add(orderItem);
		orderItem.setOrder(this);
	}
	
	public Order(Customer customer, List<Order_Item> items, LocalDate orderDate, OrderStatus status) {
		super();
		this.customer = customer;
		this.items = items;
		this.orderDate = orderDate;
		this.status = status;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	

	public LocalDate getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public List<Order_Item> getItems() {
		return items;
	}

	public void setItems(List<Order_Item> items) {
		this.items = items;
	}


	@Override
	public String toString() {
		return "Order [id=" + id + ", customer=" + customer + ", items=" + items + ", orderDate=" + orderDate
				+ ", status=" + status + "]";
	}

}
