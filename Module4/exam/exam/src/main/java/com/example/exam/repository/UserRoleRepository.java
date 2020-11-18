package com.gym.case_study.repository;


import com.gym.case_study.entity.AppUser;
import com.gym.case_study.entity.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRoleRepository extends JpaRepository<UserRole,Long> {
    List<UserRole> findByAppUser(AppUser appUser);
}
