package com.example.batchprocessdemo.repo;

import com.example.batchprocessdemo.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface repo extends JpaRepository<Customer,Integer> {
}
