package com.example.innosetytest.service;

import com.example.innosetytest.Entity.Author;
import com.example.innosetytest.Entity.Book;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public interface AuthorService {
    Author getAuthorByName(String name);
    Author saveAuthor(String name, Set<Book> books);
}
