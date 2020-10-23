package com.example.sach.services;

import com.example.sach.entity.Book;
import com.example.sach.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookServicesImpl implements BookServices {
    @Autowired
    private BookRepository bookRepository;

    @Override
    public List<Book> findAll() throws Exception {
        List<Book> bookList =this.bookRepository.findAll();
         if (bookList.size() == 0){
             throw new Exception("da het sach");
         }
         System.out.println("da vao list");
         return bookList;
    }

    @Override
    public Book findByID(Integer id) throws Exception{

        Book book = this.bookRepository.findById(id).orElse(null);

        if (book == null){
            throw new Exception("Khong tim thay sach");
        }
        System.out.println();
        return book;
    }

    @Override
    public void savaBook(Book book) {
        this.bookRepository.save(book);
        System.out.println("da luu 1 book!");

    }

    @Override
    public void deleteByID(Integer id){
        this.bookRepository.deleteById(id);
        System.out.println("1 book bi rent!");
    }
}
