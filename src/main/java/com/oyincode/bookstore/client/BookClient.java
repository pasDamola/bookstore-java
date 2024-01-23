package com.oyincode.bookstore.client;

import com.oyincode.bookstore.controller.BookController;
import com.oyincode.bookstore.dto.BookDTO;

public class BookClient {
    public static void main(String[] args) {
        BookController controller = new BookController();

        BookDTO bookDTO = new BookDTO();
        bookDTO.setBookId(111L);
        bookDTO.setAuthorEmail("author@example.com");
        bookDTO.setAuthorName("author");
        bookDTO.setAvailableQty(10);
        bookDTO.setPricePerQty(19.95);
        bookDTO.setName("Great Book");
        bookDTO.setDescription("Great Book description");


        // call controller method and hold return value
        Long bookId = controller.add(bookDTO);

        if(bookId != null) {
            System.out.println("Book successfully created " + bookId);
        } else {
            System.out.println("Error occurred while creating book");
        }


    }
}
