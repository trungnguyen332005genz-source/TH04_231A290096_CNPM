package com.example.th2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.th2.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}