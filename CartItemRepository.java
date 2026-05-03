package com.farmfresh.FarmFresh.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.farmfresh.FarmFresh.entity.CartItem;

public interface CartItemRepository extends JpaRepository<CartItem, Long>{

}
