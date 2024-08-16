package com.ecart.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecart.model.Customer;
import com.ecart.model.Order;
import com.ecart.model.OrderStatus;

public interface OrderRepository extends JpaRepository<Order, Long> {
  
	List<Order> findAllByCustomer(Customer customer);
	
	List<Order> findAllByStatus(OrderStatus status);

}


