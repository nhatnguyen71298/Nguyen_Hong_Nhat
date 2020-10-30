package com.example.phone_manage.repository;

import com.example.phone_manage.entity.Smartphone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface SmartphoneRepository extends JpaRepository<Smartphone,Integer> {

}
