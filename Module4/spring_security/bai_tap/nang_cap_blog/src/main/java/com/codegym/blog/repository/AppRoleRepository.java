package com.codegym.blog.repository;

import com.codegym.blog.entity.AppRole;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppRoleRepository extends JpaRepository<AppRole,Long> {
    AppRole findByRoleId(Long id);
}
