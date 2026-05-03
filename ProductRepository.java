package com.farmfresh.FarmFresh.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.farmfresh.FarmFresh.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
