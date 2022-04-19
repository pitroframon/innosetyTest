package com.example.innosetytest.service;

import com.example.innosetytest.Entity.Author;
import com.example.innosetytest.Entity.Book;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public interface BookService {
    Book saveBook(String title, Set<Author> authors);
    Set<Book> getBooksByAuthor(Author author);
    Set<Book> getAllBooks();
}
