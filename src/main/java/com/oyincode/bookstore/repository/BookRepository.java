package com.oyincode.bookstore.repository;

import com.oyincode.bookstore.entity.BookEntity;

public interface BookRepository {
    public Long add(BookEntity bookEntity);
}
