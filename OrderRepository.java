package com.ecart.repo;



import org.springframework.data.jpa.repository.JpaRepository;

import com.ecart.model.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
}


