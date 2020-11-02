package com.codegym.blog.services;

import com.codegym.blog.entity.Blog;
import com.codegym.blog.entity.Catelory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface CateloryServices {
    Page<Catelory> findAllCatelory(Pageable pageable);
    List<Catelory> findAllCatelory();
    Catelory findByID(Integer id);
}
