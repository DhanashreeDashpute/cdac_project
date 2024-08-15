package com.ecart.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ecart.model.Payment;
import com.ecart.repo.PaymentRepository;

import java.util.List;

@Service
public class PaymentService {

    @Autowired
    private PaymentRepository paymentRepository;

    public List<Payment> getAllPayments() {
        return paymentRepository.findAll();
    }

    public Payment savePayment(Payment payment) {
        return paymentRepository.save(payment);
    }

    public Payment getPaymentById(Long id) {
        return paymentRepository.findById(id).orElse(null);
    }
}

