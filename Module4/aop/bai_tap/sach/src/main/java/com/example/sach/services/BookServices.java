package com.example.sach.services;

import com.example.sach.entity.Book;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

public interface BookServices {
    List<Book> findAll() throws Exception;
    Book findByID(Integer id) throws Exception;
    void  savaBook(Book book);
    void deleteByID(Integer id);
}
