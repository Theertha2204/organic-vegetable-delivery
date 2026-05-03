package com.farmfresh.FarmFresh.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.farmfresh.FarmFresh.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
