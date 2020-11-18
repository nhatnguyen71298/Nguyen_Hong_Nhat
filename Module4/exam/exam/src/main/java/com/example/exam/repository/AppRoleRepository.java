package com.gym.case_study.repository;

import com.gym.case_study.entity.AppRole;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppRoleRepository extends JpaRepository<AppRole,Long> {
    AppRole findByRoleId(Long id);
}
