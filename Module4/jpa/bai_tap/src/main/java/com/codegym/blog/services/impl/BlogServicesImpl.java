package com.codegym.blog.services.impl;

import com.codegym.blog.entity.Blog;
import com.codegym.blog.repository.BlogRepository;
import com.codegym.blog.services.BlogServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogServicesImpl implements BlogServices {
    @Autowired
    private BlogRepository blogRepository;

    @Override
    public void updateBlog(Blog blog) {
        this.blogRepository.save(blog);
    }

    @Override
    public void createBlog(Blog blog) {
        this.blogRepository.save(blog);
    }

    @Override
    public List<Blog> findAll() {
        return this.blogRepository.findAll();
    }

    @Override
    public Blog findByID(Integer id) {
        return this.blogRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteByID(Blog blog) {
        this.blogRepository.delete(blog);
    }
}
