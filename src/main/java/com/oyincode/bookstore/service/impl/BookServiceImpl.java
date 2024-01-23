package com.oyincode.bookstore.service.impl;

import com.oyincode.bookstore.controller.BookConverter;
import com.oyincode.bookstore.dto.BookDTO;
import com.oyincode.bookstore.entity.BookEntity;
import com.oyincode.bookstore.repository.BookRepository;
import com.oyincode.bookstore.repository.impl.BookRepositoryImpl;
import com.oyincode.bookstore.service.BookService;

public class BookServiceImpl implements BookService {
    private BookRepository bookRepository;

    public BookServiceImpl() {
        this.bookRepository = new BookRepositoryImpl();
    }
    @Override
    public Long add(BookDTO bookDTO) {
        //Adapter Design pattern
        BookEntity bookEntity = BookConverter.convertBootDTOtoBooEntity(bookDTO);
        return this.bookRepository.add(bookEntity);
    }
}
