package com.example.innosetytest.service;

import com.example.innosetytest.Entity.Author;
import com.example.innosetytest.Entity.Book;
import com.example.innosetytest.repository.AuthorRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Set;

@Service
@Transactional
public class AuthorServiceImpl implements AuthorService{

    private AuthorRepository authorRepository;

    public AuthorServiceImpl(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Override
    public Author getAuthorByName(String name) {
        return authorRepository.getAuthorByName(name);
    }

    @Override
    public Author saveAuthor(String name, Set<Book> books) {
        Author author = new Author();
        author.setName(name);
        books.forEach(author::addBook);
        return authorRepository.save(author);
    }
}
