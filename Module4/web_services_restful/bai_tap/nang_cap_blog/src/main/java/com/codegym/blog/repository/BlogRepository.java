package com.codegym.blog.repository;

import com.codegym.blog.entity.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Blog,Integer> {
    Page<Blog> findAllByNameContaining(Pageable pageable,String name);
    Page<Blog> findAllByCateloryBlogId(Pageable pageable,Integer id);
    Page<Blog> findByOrderByDateWrite(Pageable pageable);
}
