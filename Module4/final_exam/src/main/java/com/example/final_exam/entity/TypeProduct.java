package com.example.exam.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class TypeProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_type_product;

    private String name;

    @OneToMany(mappedBy = "typeProduct",cascade = CascadeType.ALL)
    List<Product> productList;

    public TypeProduct() {
    }

    public Integer getId_type_product() {
        return id_type_product;
    }

    public void setId_type_product(Integer id_type_product) {
        this.id_type_product = id_type_product;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }
}
