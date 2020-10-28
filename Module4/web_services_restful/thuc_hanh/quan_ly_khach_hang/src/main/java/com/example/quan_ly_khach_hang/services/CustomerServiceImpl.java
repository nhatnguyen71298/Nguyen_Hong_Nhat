package com.example.quan_ly_khach_hang.services;

import com.example.quan_ly_khach_hang.entity.Customer;
import com.example.quan_ly_khach_hang.repository.RepositoryCustomer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private RepositoryCustomer repositoryCustomer;

    @Override
    public List<Customer> findAll() {
        return this.repositoryCustomer.findAll();
    }

    @Override
    public Customer findById(Long id) {
        return this.repositoryCustomer.findById(id).orElse(null);
    }

    @Override
    public void save(Customer customer) {
        this.repositoryCustomer.save(customer);
    }

    @Override
    public void remove(Long id) {
        this.repositoryCustomer.deleteById(id);
    }
}
