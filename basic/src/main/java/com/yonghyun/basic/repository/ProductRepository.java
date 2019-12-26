package com.yonghyun.basic.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yonghyun.basic.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
	public Product findByName(String name);
	public List<Product> findByPriceGreaterThan(int price);
}