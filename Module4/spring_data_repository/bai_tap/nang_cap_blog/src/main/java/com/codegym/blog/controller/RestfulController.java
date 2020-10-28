package com.codegym.blog.controller;

import com.codegym.blog.entity.Blog;
import com.codegym.blog.entity.Catelory;
import com.codegym.blog.services.BlogServices;
import com.codegym.blog.services.CateloryServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RestfulController {
    @Autowired
    private CateloryServices cateloryServices;

    @Autowired
    private BlogServices blogServices;

    @GetMapping("/listCatelory")
    public ResponseEntity<List<Catelory>> listCatelory(){
        return new ResponseEntity<List<Catelory>>(this.cateloryServices.findAllCatelory(), HttpStatus.OK);
    }

    @GetMapping("/listBlog")
    public ResponseEntity<List<Blog>> listBlog(){
        return new ResponseEntity<List<Blog>>(this.blogServices.findAll(),HttpStatus.OK);
    }

    @GetMapping("/getBlogCatelory/{id}")
    public ResponseEntity<List<Blog>> listBlogCatelory(@PathVariable Integer id){
        return new ResponseEntity<List<Blog>>(this.cateloryServices.findByID(id).getBlogList(),HttpStatus.OK);
    }

    @GetMapping("/readBlog/{id}")
    public ResponseEntity<Blog> readBlog(@PathVariable Integer id){
        return new ResponseEntity<Blog>(this.blogServices.findByID(id),HttpStatus.OK);
    }
}
