package com.ung_dung_quan_li_san_pham.services;

import com.ung_dung_quan_li_san_pham.entity.Province;

public interface ProvinceService {
    Iterable<Province> findAll();

    Province findById(Long id);

    void save(Province province);

    void remove(Long id);
}
