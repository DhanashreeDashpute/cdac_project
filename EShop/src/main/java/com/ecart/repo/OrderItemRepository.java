package com.ecart.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecart.model.Order;
import com.ecart.model.Order_Item;

public interface OrderItemRepository extends JpaRepository<Order_Item, Long> {

	List<Order_Item> findAllByOrder(Order order);
}
