package com.ecart.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Otp {

	public Otp(Order order, String otp_code, LocalDate generationDate, LocalDate verificationDate) {
		super();
		this.order = order;
		this.otp_code = otp_code;
		this.generationDate = generationDate;
		this.verificationDate = verificationDate;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@OneToOne
	@JoinColumn(name="order_id")
	private Order order;
	
	private String otp_code;
	private LocalDate generationDate;
	private LocalDate verificationDate;
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	public String getOtp_code() {
		return otp_code;
	}
	public void setOtp_code(String otp_code) {
		this.otp_code = otp_code;
	}
	public LocalDate getGenerationDate() {
		return generationDate;
	}
	public void setGenerationDate(LocalDate generationDate) {
		this.generationDate = generationDate;
	}
	public LocalDate getVerificationDate() {
		return verificationDate;
	}
	public void setVerificationDate(LocalDate verificationDate) {
		this.verificationDate = verificationDate;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Otp [id=" + id + ", order=" + order + ", otp_code=" + otp_code + ", generationDate=" + generationDate
				+ ", verificationDate=" + verificationDate + "]";
	}
	
}
