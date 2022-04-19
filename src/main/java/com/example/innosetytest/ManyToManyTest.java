package com.example.innosetytest;

import com.example.innosetytest.Entity.Author;
import com.example.innosetytest.Entity.Book;
import com.example.innosetytest.service.AuthorService;
import com.example.innosetytest.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@Component
public class ManyToManyTest {

//    private AuthorController authorController;
//    private BookController bookController;
    private AuthorService authorService;
    private BookService bookService;

    public ManyToManyTest(
//            AuthorController authorController, BookController bookController,
                          AuthorService authorService, BookService bookService) {
//        this.authorController = authorController;
//        this.bookController = bookController;
        this.authorService = authorService;
        this.bookService = bookService;
    }

    @PostConstruct
    public void test(){
        System.out.println("Test starting...");
        createTestAuthorsAndBooks();
        System.out.println("Test authors and books created");
//        System.out.println("Controllers tests starting...");
//        controllersTest();
//        System.out.println("Tests finished");

    }

    public void createTestAuthorsAndBooks(){
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

//    public void controllersTest(){
//        Book b1 = new Book();
//        b1.setTitle("Evgeniy Onegin");
//        Book b2 = new Book();
//        b2.setTitle("Pikovaya dama");
//        Set<Book> books = new HashSet<>();
//        books.add(b1);
//        books.add(b2);
//        System.out.println("Checking saveAuthor");
//        System.out.println(authorController.saveAuthor("Pushkin", books));
//        System.out.println("Checking getAuthor");
//        System.out.println(authorController.getAuthor("Dostoevsky"));
//
//
//        Author author = new Author();
//        author.setName("Gugo");
//        Set<Author> authors = new HashSet<>();
//        authors.add(author);
////        authorService.saveAuthor(author.getName(), author.getBooks());
//        System.out.println("Checking saveBook");
//        System.out.println(bookController.saveBook("Oderzhimiye", authors));//лишнее
//
//
//        author = authorService.getAuthorByName("Tolstoy");
//        System.out.println("Checking getBooksByAuthor");
//        System.out.println(bookController.getBooksByAuthor(author));
//
//        System.out.println("Checking getAllBooks");
//        System.out.println(bookController.getAllBooks());
//    }
}
