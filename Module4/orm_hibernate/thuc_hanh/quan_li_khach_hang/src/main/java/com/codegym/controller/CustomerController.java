package com.codegym.controller;

import com.codegym.entity.Customer;
import com.codegym.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @GetMapping(value = "/")
    public String goListCustomer(Model model) {
        List<Customer> customerList=this.customerService.findAll();
        model.addAttribute("listCustomer", customerList);
        return "list_customer";
    }
    @GetMapping("/view/{id}")
    public String goViewCustomer(@PathVariable Integer id, Model model){
        model.addAttribute("infoCustomer", customerService.findById(id));
        return "view_customer";
    }
    @GetMapping("/customer/create")
    public String goViewCreateCustomer(Model model){
        model.addAttribute("newCustomer",new Customer());
        return "create_customer";
    }
    @PostMapping("/customer/create")
    public String saveNewCustomer(Customer newCustomer, RedirectAttributes redirectAttributes){
        this.customerService.save(newCustomer);
        redirectAttributes.addFlashAttribute("message","Create customer ok!");
        return "redirect:/";
    }
    @GetMapping("/delete/{id}")
    public String deleteCustomer(@PathVariable Integer id, RedirectAttributes redirectAttributes){
        Customer customerDel=this.customerService.findById(id);
        redirectAttributes.addFlashAttribute("message","Deleted customer "+customerDel.getName()+" !");
        this.customerService.deleteByID(customerDel);
        return "redirect:/";
    }
    @GetMapping("/edit/{id}")
    public String goEditView(@PathVariable Integer id, Model model){
        model.addAttribute("customerEdit",this.customerService.findById(id));
        return "edit_customer";
    }
    @PostMapping("/customer/edit")
    public String editCustomer(Customer customerEdit,RedirectAttributes redirectAttributes) {
        this.customerService.updateCustomer(customerEdit);
        redirectAttributes.addFlashAttribute("message", "Updated customer " + customerEdit.getName() + " !");
        return "redirect:/";
    }
}
