package com.example.th2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.th2.entity.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

}