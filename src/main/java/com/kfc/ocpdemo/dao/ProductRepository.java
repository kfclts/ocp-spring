package com.kfc.ocpdemo.dao;

import com.kfc.ocpdemo.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
