package com.example.product.controller;

import com.example.product.entity.Product;
import com.example.product.services.ProductServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Controller
@SessionAttributes("cartProduct")
public class ProductController {



    @Autowired
    private ProductServices productServices;

    @ModelAttribute("cartProduct")
    public List<Product> cartProduct(){
        return new ArrayList<>();
    }

    @GetMapping
    public String homeView(Model model, @PageableDefault(size = 2) Pageable pageable){
        model.addAttribute("allProduct",this.productServices.findAll(pageable));
        return "home";
    }



    @GetMapping("/detail")
    public String detailProduct(@RequestParam Integer id,Model model){
        model.addAttribute("detailProduct",this.productServices.findByID(id));
        return "detail";
    }




    @GetMapping("/buyProduct")
    public String detailProduct(@RequestParam Integer id,Model model,@SessionAttribute("cartProduct") List<Product> cartProduct){
//        if (cartProduct().isEmpty()){
//            ArrayList<Product> cartProductList=new ArrayList<>();
//            cartProductList.add(this.productServices.findByID(id));
//            cartProduct=cartProductList;
//        } else {
            cartProduct.add(this.productServices.findByID(id));
//        }
        model.addAttribute("messenger","Added a new product to cart!");
        return "cart";
    }

    @GetMapping("/cart")
    public String cartProduct(Model model, @SessionAttribute("cartProduct") List<Product> cartProduct){
        model.addAttribute("cartProduct",cartProduct);
        return "cart";
    }

    @GetMapping("/delete_cart")
    public String deleteCartProduct(@RequestParam Integer id,@SessionAttribute("cartProduct") List<Product> cartProduct){
        int index=Integer.parseInt(String.valueOf(id));
        for (int i=0;i<cartProduct.size();i++){
            if (index==i){
                cartProduct.remove(index);
                break;
            }
        }
        return "cart";
    }

    @GetMapping("/deleteAll")
    public String deleteAll(@SessionAttribute("cartProduct") List<Product> cartProduct){
        cartProduct.removeAll(cartProduct);
        return "cart";
    }
}
