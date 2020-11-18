package com.example.exam.controller;

import com.example.exam.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/product")
    public String viewProduct(Model model, @PageableDefault(size = 5) Pageable pageable){
        model.addAttribute("allProduct",this.productService.findAllProduct(pageable));
        return "product/product_view";
    }
}
