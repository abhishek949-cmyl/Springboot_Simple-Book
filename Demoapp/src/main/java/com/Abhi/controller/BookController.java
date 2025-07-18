package com.Abhi.controller;

import com.Abhi.service.BookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public class BookController{
    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
            }

    @GetMapping("/book/{id}")
    public String getBook(@PathVariable Long id) {
        return bookService.getTitle(id);
    }
}



