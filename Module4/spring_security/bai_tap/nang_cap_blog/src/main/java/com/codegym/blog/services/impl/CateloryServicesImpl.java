package com.codegym.blog.services.impl;

import com.codegym.blog.entity.Blog;
import com.codegym.blog.entity.Catelory;
import com.codegym.blog.repository.CateloryRepository;
import com.codegym.blog.services.BlogServices;
import com.codegym.blog.services.CateloryServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CateloryServicesImpl implements CateloryServices {

    @Autowired
    private CateloryRepository cateloryRepository;

    @Override
    public Page<Catelory> findAllCatelory(Pageable pageable) {
        return this.cateloryRepository.findAll(pageable);
    }

    @Override
    public List<Catelory> findAllCatelory() {
        return this.cateloryRepository.findAll();
    }

    @Override
    public Catelory findByID(Integer id) {
        return this.cateloryRepository.findById(id).orElse(null);
    }
}
