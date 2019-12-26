package com.yonghyun.basic.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import com.yonghyun.basic.model.Product;
import com.yonghyun.basic.repository.ProductRepository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class JpaController {
	@Autowired
	ProductRepository productRepository;

	@GetMapping("/jpa/product")
	public List<Product> product() {
		List<Product> list = productRepository.findAll();
		return list;
	}
	
	@GetMapping("/jpa/product2")
	public Product product2(String name) {
		Product pro = productRepository.findByName(name);
		return pro;
	}
	
	@GetMapping("/jpa/product3")
	public List<Product> product3(int price) {
		List<Product> list = productRepository.findByPriceGreaterThan(price);
		return list;
	}

	@PostMapping("/jpa/product")
	public String productPost(@ModelAttribute Product product) {
		Product pro = productRepository.save(product);
		log.error(pro.toString());
		return "redirect:/jpa/product";
	}
}