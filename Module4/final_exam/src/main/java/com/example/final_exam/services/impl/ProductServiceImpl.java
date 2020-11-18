package com.example.exam.services.impl;

import com.example.exam.entity.Product;
import com.example.exam.repository.ProductRepository;
import com.example.exam.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public void updateProduct(Product product) {
        this.productRepository.save(product);
    }

    @Override
    public Page<Product> findAllProduct(Pageable pageable) {
        return this.productRepository.findAll(pageable);
    }

    @Override
    public List<Product> findAllProduct() {
        return this.productRepository.findAll();
    }
}
