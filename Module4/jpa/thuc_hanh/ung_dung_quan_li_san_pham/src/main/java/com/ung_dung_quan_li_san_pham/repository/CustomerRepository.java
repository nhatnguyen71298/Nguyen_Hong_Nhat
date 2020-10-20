package com.ung_dung_quan_li_san_pham.repository;

import com.ung_dung_quan_li_san_pham.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Long> {
}
