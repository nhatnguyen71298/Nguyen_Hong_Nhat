package com.example.exam.services;

import com.example.exam.entity.Employee;
import com.example.exam.entity.Product;
import com.example.exam.entity.TypeEmployee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ProductService {
    void updateProduct(Product product);
    Page<Product> findAllProduct(Pageable pageable);
    List<Product> findAllProduct();
//    List<TypeEmployee> findAllTypeEmployee();
//    Employee findById(Integer id);
//    void deleteEmployeeById(Integer id);
//    Page<Employee> searchByname(Pageable pageable,String keyword);
//    Page<Employee> searchByEmail(Pageable pageable,String keyword);
}
