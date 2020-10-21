package com.codegym.blog.services;

import com.codegym.blog.entity.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


public interface BlogServices {
    void updateBlog(Blog blog);
    void createBlog(Blog blog);
    Page<Blog> findAll(Pageable pageable);
    Blog findByID(Integer id);
    void deleteByID(Blog blog);
    Page<Blog> findBlogByName(Pageable pageable,String name);
    Page<Blog> findAllByCateloryBlogId(Pageable pageable,Integer id);
}
