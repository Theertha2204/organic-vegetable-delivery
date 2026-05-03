package com.farmfresh.FarmFresh.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.farmfresh.FarmFresh.entity.Orders;

public interface OrdersRepository extends JpaRepository<Orders, Long>  {

}
