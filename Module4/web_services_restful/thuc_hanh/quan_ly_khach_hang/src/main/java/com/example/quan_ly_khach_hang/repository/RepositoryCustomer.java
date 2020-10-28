package com.example.quan_ly_khach_hang.repository;

import com.example.quan_ly_khach_hang.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryCustomer extends JpaRepository<Customer,Long> {
}
