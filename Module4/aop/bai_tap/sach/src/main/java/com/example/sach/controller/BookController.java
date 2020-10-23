package com.example.sach.controller;

import com.example.sach.entity.Book;
import com.example.sach.services.BookServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class BookController {
    @Autowired
    private BookServices bookServices;


    @GetMapping({"/create","/"})
    public String goCreateBook(Model model){
        model.addAttribute("newBook",new Book());
        return "create";
    }
    @PostMapping("/create")
    public String saveBook(Book newBook, Model model) throws Exception{
        this.bookServices.savaBook(newBook);
        model.addAttribute("message","Created a new book !");
        model.addAttribute("listBook",this.bookServices.findAll());
        return "home";
    }
    @GetMapping("/list")
    public String listBook(Model model) throws Exception{
        model.addAttribute("listBook",this.bookServices.findAll());
        return "list";
    }
    @GetMapping("/rent")
    public String rentBook  (@RequestParam Integer idRent,Model model) throws Exception{
        String nameDel=this.bookServices.findByID(idRent).getName();
        this.bookServices.deleteByID(idRent);
        model.addAttribute("message","Rented "+nameDel+" !");
        model.addAttribute("listBook",this.bookServices.findAll());
        return "home";
    }

    @ExceptionHandler(value = Exception.class)
    public String handleException() {
        return "error";
    }
}
