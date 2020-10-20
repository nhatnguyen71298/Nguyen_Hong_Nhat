package com.codegym.blog.controller;

import com.codegym.blog.entity.Blog;
import com.codegym.blog.services.BlogServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.persistence.criteria.CriteriaBuilder;

@Controller
public class BlogController {
    @Autowired
    private BlogServices blogServices;

    @GetMapping("/")
    public String goListBlog(Model model){
        model.addAttribute("allBlog",this.blogServices.findAll());
        return "list";
    }

    @GetMapping(value = "/create_blog_form")
    public String goFormCreateBlog(Model model){
        model.addAttribute("newBlog",new Blog());
        return "create";
    }

    @PostMapping(value = "/create")
    public String createNewBlog(Blog newBlog){
        this.blogServices.createBlog(newBlog);
        return "redirect:/";
    }
    @GetMapping("/readBlog")
    public String goviewReadBlog(@RequestParam Integer id,Model model){
        model.addAttribute("blog",this.blogServices.findByID(id));
        return "view_read_blog";
    }
    @GetMapping("/edit")
    public String goEditForm(@RequestParam Integer id, Model model){
        model.addAttribute("newBlog",this.blogServices.findByID(id));
        return "create";
    }
    @GetMapping("/delete")
    public String deleteBlog(@RequestParam Integer id){
        this.blogServices.deleteByID(this.blogServices.findByID(id));
        return "redirect:/";
    }
}
