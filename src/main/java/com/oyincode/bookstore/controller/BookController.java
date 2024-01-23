package com.oyincode.bookstore.controller;

import com.oyincode.bookstore.dto.BookDTO;
import com.oyincode.bookstore.service.BookService;
import com.oyincode.bookstore.service.impl.BookServiceImpl;

public class BookController {
    private BookService bookService;
    public BookController() {
        // Dynamic runtime polymorphism
        this.bookService = new BookServiceImpl();
    }
    public Long add(BookDTO bookDTO) {
        return this.bookService.add(bookDTO);
    }
}
