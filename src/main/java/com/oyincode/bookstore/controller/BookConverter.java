package com.oyincode.bookstore.controller;

import com.oyincode.bookstore.dto.BookDTO;
import com.oyincode.bookstore.entity.BookEntity;

public class BookConverter {
    public static BookEntity convertBootDTOtoBooEntity(BookDTO bookDTO) {
        BookEntity be  = new BookEntity();

        be.setBookId(bookDTO.getBookId());
        be.setAuthorEmail(bookDTO.getAuthorEmail());
        be.setName(bookDTO.getName());
        be.setAuthorEmail(bookDTO.getAuthorName());
        be.setPricePerQty(bookDTO.getPricePerQty());
        be.setAvailableQty(bookDTO.getAvailableQty());
        be.setDescription(bookDTO.getDescription());

        return be;
    }
}
