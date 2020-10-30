package com.example.phone_manage.services;

import com.example.phone_manage.entity.Smartphone;

public interface SmartphoneService {
    Iterable<Smartphone> findAll();
    Smartphone findById(Integer id);
    Smartphone save(Smartphone phone);
    void remove(Integer id);
}
