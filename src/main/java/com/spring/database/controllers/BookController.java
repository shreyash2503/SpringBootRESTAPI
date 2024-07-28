package com.spring.database.controllers;


import com.spring.database.domain.BookEntity;
import com.spring.database.domain.dto.BookDto;
import com.spring.database.mappers.Mapper;
import com.spring.database.services.BookService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
    private final BookService bookService;
    private Mapper<BookEntity, BookDto> bookMapper;


    public BookController(BookService bookService, Mapper<BookEntity, BookDto> bookMapper) {
        this.bookMapper = bookMapper;
        this.bookService = bookService;
    }

    @PostMapping(path = "/api/v1/book/create")
    public BookDto createBook(@RequestBody BookDto bookDto) {
        BookEntity book = bookMapper.mapFrom(bookDto);
        BookEntity savedBookEntity = bookService.createBook(book);
        return bookMapper.mapTo(savedBookEntity);



    }

}
