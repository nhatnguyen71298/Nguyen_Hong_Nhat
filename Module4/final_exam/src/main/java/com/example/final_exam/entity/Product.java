package com.example.exam.entity;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;

@Entity(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_prduct;

    @Pattern(regexp = "\\w+",message = "Please input")
    private String name;
    @Min(value = 100000)
    @Pattern(regexp = "",message = "Input price >100000")
    private String price;
    @Pattern(regexp = "\\w+",message = "Please input")
    private String status;

    @ManyToOne
    @JoinColumn(name = "id_type_product",referencedColumnName = "id_type_product")
    private Product typeProduct;

    public Product() {
    }

    public Integer getId_prduct() {
        return id_prduct;
    }

    public void setId_prduct(Integer id_prduct) {
        this.id_prduct = id_prduct;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Product getTypeProduct() {
        return typeProduct;
    }

    public void setTypeProduct(Product typeProduct) {
        this.typeProduct = typeProduct;
    }
}
