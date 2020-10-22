package com.codegym.validate_form.services;

import com.codegym.validate_form.entity.BeDe;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface BeDeServies {
    void saveBeDe(BeDe beDe);
    Page<BeDe> fillAllBeDe(Pageable pageable);
}
