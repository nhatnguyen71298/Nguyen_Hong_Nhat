package com.codegym.validate_form.services;

import com.codegym.validate_form.entity.BeDe;
import com.codegym.validate_form.repository.BeDeRepostitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class BeDeServicesImpl implements BeDeServies {

    @Autowired
    private BeDeRepostitory beDeRepostitory;

    @Override
    public void saveBeDe(BeDe beDe) {
        this.beDeRepostitory.save(beDe);
    }

    @Override
    public Page<BeDe> fillAllBeDe(Pageable pageable) {
        return this.beDeRepostitory.findAll(pageable);
    }
}
