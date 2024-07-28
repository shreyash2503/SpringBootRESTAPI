package com.spring.database.services;

import com.spring.database.domain.BookEntity;

public interface BookService {
    BookEntity createBook(BookEntity book);
}
