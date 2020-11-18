package com.gym.case_study.repository;

import com.gym.case_study.entity.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
    Page<Employee> findAllByNameContaining(Pageable pageable,String keyword);
    Page<Employee> findAllByPostionContaining(Pageable pageable,String keyword);
//    Page<Employee> findAllByNameContainingAndDivisionContaining(Pageable pageable,String name,String division);
}
