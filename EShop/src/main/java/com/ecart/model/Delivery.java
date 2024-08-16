package com.ecart.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Delivery {
	
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@OneToOne
	@JoinColumn(name="order_id")
	private Order order;
	
	private LocalDate date;
	private String status;
	
	@OneToOne
	@JoinColumn(name="otp_id")
	private Otp otp;

	
	public Delivery( Order order, LocalDate date, String status, Otp otp) {
		super();
		
		this.order = order;
		this.date = date;
		this.status = status;
		this.otp = otp;
	}
	
	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Otp getOtp() {
		return otp;
	}

	public void setOtp(Otp otp) {
		this.otp = otp;
	}

	@Override
	public String toString() {
		return "Delivery [id=" + id + ", order=" + order + ", date=" + date + ", status=" + status + ", otp=" + otp
				+ "]";
	}
	
	
	

}
