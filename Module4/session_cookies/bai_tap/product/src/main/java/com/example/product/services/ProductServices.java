package com.example.product.services;

import com.example.product.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ProductServices {
    Page<Product> findAll(Pageable pageable);
    Product findByID(Integer id);
    List<Product> findAll();
}
