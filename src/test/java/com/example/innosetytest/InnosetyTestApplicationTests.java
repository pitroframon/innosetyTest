package com.example.innosetytest;

import com.example.innosetytest.Entity.Author;
import com.example.innosetytest.Entity.Book;
import com.example.innosetytest.service.AuthorService;
import com.example.innosetytest.service.BookService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import java.util.HashSet;
import java.util.Set;

@SpringBootTest
@ActiveProfiles("integration-test")
class InnosetyTestApplicationTests {

    @Autowired
    private AuthorService authorService;
    @Autowired
    private BookService bookService;


    @Test
    void createAuthorsAndBooksTest() {
        Author author1 = new Author();
        author1.setName("Tolstoy");

        Book b1 = new Book();
        b1.setTitle("Voina i mir");

        Book b2 = new Book();
        b2.setTitle("Anna Karenina");

        author1.addBook(b1);
        author1.addBook(b2);
        authorService.saveAuthor(author1.getName(), author1.getBooks());

        Author author2 = new Author();
        author2.setName("Dostoevsky");

        Book b3 = new Book();
        b3.setTitle("Prestuplenie i nakozanie");

        Book b4 = new Book();
        b4.setTitle("Bratiya Karamazovy");

        author2.addBook(b3);
        author2.addBook(b4);
        authorService.saveAuthor(author2.getName(), author2.getBooks());

    }

    @Test
    void createBooksTest(){
        Author author = new Author();
        author.setName("Gugo");
        Set<Author> authors = new HashSet<>();
        authors.add(author);
        bookService.saveBook("Otverzhenniye", authors);

        author = new Author();
        author.setName("London");
        authors = new HashSet<>();
        authors.add(author);
        bookService.saveBook("Martin Idn", authors);
    }

    @Test
    void getAuthorByNameTest(){
        authorService.getAuthorByName("Tolstoy");
    }

    @Test
    void getAllBooksTest(){
        bookService.getAllBooks();
    }

    @Test
    void getBooksByAuthor(){
        bookService.getBooksByAuthor(authorService.getAuthorByName("Dostoevsky"));
    }

}
