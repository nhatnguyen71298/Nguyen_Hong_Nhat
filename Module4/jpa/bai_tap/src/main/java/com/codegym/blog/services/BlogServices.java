package com.codegym.blog.services;

import com.codegym.blog.entity.Blog;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

public interface BlogServices {
    void updateBlog(Blog blog);
    void createBlog(Blog blog);
    List<Blog> findAll();
    Blog findByID(Integer id);
    void deleteByID(Blog blog);
}
