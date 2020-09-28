package ung_dung_quan_ly_san_pham.service;

import ung_dung_quan_ly_san_pham.model.Product;

import java.util.List;

public interface ProductService {
    List<Product> findAll();

    void save(Product product);

    Product findById(int id);

    void update(int id, Product customer);

    void remove(int id);
}
