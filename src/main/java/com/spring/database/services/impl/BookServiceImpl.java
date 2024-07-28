package com.spring.database.services.impl;

import com.spring.database.domain.BookEntity;
import com.spring.database.repositories.BookRepository;
import com.spring.database.services.BookService;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {
    private final BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    @Override
    public BookEntity createBook(BookEntity book) {
        return bookRepository.save(book);

    }
}
