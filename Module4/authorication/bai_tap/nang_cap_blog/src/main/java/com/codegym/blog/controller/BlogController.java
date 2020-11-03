package com.codegym.blog.controller;

import com.codegym.blog.entity.Blog;
import com.codegym.blog.services.BlogServices;
import com.codegym.blog.services.CateloryServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Controller
public class BlogController {
    @Autowired
    private BlogServices blogServices;

    @Autowired
    private CateloryServices cateloryServices;



    @GetMapping("/home")
    public String goListBlog(Model model, @PageableDefault(size = 2) Pageable pageable,@RequestParam Optional<String> keyword){
        String keywordOld="";
        if (keyword.isPresent()){
            keywordOld=keyword.get();
            model.addAttribute("allBlog",this.blogServices.findBlogByName(pageable,keywordOld));
        } else {
            model.addAttribute("allBlog",this.blogServices.findAll(pageable));
        }

        model.addAttribute("keywordOld",keywordOld);

        return "home";
    }

    @GetMapping(value = "/create_blog_form")
    public String goFormCreateBlog(Model model){
        model.addAttribute("newBlog",new Blog());
        model.addAttribute("allCatelory",this.cateloryServices.findAllCatelory());
        return "blog/create";
    }

    @PostMapping(value = "/create")
    public String createNewBlog(Blog newBlog){
        newBlog.setDateWrite(String.valueOf(java.time.LocalDate.now()));
        this.blogServices.createBlog(newBlog);
        return "redirect:/home";
    }
    @GetMapping("/readBlog")
    public String goviewReadBlog(@RequestParam Integer id,Model model){
        model.addAttribute("blog",this.blogServices.findByID(id));
        return "blog/view_read_blog";
    }
    @GetMapping("/edit")
    public String goEditForm(@RequestParam Integer id, Model model){
        model.addAttribute("newBlog",this.blogServices.findByID(id));
        return "blog/create";
    }
    @GetMapping("/delete")
    public String deleteBlog(@RequestParam Integer id){
        this.blogServices.deleteByID(this.blogServices.findByID(id));
        return "redirect:/home";
    }

    @GetMapping("/403")
    public String go403() {
        return "403";
    }
}
