package com.codegym.blog.services.impl;

import com.codegym.blog.entity.Blog;
import com.codegym.blog.repository.BlogRepository;
import com.codegym.blog.services.BlogServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
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
    public Page<Blog> findAll(Pageable pageable) {
        return this.blogRepository.findByOrderByDateWrite(pageable);
    }



    @Override
    public Blog findByID(Integer id) {
        return this.blogRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteByID(Blog blog) {
        this.blogRepository.delete(blog);
    }

    @Override
    public Page<Blog> findBlogByName(Pageable pageable,String name) {
        return this.blogRepository.findAllByNameContaining(pageable, name);
    }

    @Override
    public Page<Blog> findAllByCateloryBlogId(Pageable pageable, Integer id) {
        return this.blogRepository.findAllByCateloryBlogId(pageable,id);
    }
}
