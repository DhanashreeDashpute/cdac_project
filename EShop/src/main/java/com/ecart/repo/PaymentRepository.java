package com.ecart.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecart.model.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
}

