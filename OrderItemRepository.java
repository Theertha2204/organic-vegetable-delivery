package com.farmfresh.FarmFresh.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.farmfresh.FarmFresh.entity.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
