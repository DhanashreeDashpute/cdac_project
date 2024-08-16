package com.ecart.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="order_items")
public class Order_Item {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="order_id",nullable=false)
	@JsonIgnore
	private Order order;
    
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="prodct_id",nullable = false)
	private Product product;
	
	private int quantity;
	private Double subtotal;
	
	public Order_Item(Order order, Product product, int quantity, Double subtotal) {
		super();
		this.order = order;
		this.product = product;
		this.quantity = quantity;
		this.subtotal = subtotal;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Double getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(Double subtotal) {
		this.subtotal = subtotal;
	}

	@Override
	public String toString() {
		return "Order_Item [id=" + id + ", order=" + order + ", product=" + product + ", quantity=" + quantity
				+ ", subtotal=" + subtotal + "]";
	}
	

}
