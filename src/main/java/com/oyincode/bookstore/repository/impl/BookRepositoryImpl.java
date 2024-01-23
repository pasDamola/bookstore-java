package com.oyincode.bookstore.repository.impl;

import com.oyincode.bookstore.entity.BookEntity;
import com.oyincode.bookstore.repository.BookRepository;

import java.util.ArrayList;
import java.util.List;

public class BookRepositoryImpl implements BookRepository {
    private List<BookEntity> booksList;

    public BookRepositoryImpl() {
        this.booksList = new ArrayList<>();
    }
    @Override
    public Long add(BookEntity bookEntity) {
       this.booksList.add(bookEntity);
       return bookEntity.getBookId();
    }


}
