package com.example.innosetytest.service;

import com.example.innosetytest.Entity.Author;
import com.example.innosetytest.Entity.Book;
import com.example.innosetytest.repository.AuthorRepository;
import com.example.innosetytest.repository.BookRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
@Transactional
public class BookServiceImpl implements BookService{

    private BookRepository bookRepository;
    private AuthorService authorService;

    public BookServiceImpl(BookRepository bookRepository, AuthorService authorService) {
        this.bookRepository = bookRepository;
        this.authorService = authorService;
    }

    @Override
    public Book saveBook(String title, Set<Author> authors) {
        Book book = new Book();
        book.setTitle(title);
        for(Author au : authors){
            au.addBook(book);
            authorService.saveAuthor(au.getName(), au.getBooks());
        }
        return bookRepository.findByTitle(title);
    }

    @Override
    public Set<Book> getBooksByAuthor(Author author) {
        return bookRepository.getBookByAuthors(author);
    }

    @Override
    public Set<Book> getAllBooks() {
        return new HashSet<>(bookRepository.findAll());
    }
}
