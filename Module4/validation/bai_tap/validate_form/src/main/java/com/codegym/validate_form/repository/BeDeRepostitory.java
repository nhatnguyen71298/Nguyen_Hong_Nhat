package com.codegym.validate_form.repository;

import com.codegym.validate_form.entity.BeDe;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BeDeRepostitory extends JpaRepository<BeDe, Integer> {
}
