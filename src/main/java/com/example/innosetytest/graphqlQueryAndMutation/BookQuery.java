//package com.example.innosetytest.graphqlQueryAndMutation;
//
//import com.coxautodev.graphql.tools.GraphQLQueryResolver;
//import com.example.innosetytest.Entity.Author;
//import com.example.innosetytest.Entity.Book;
//import com.example.innosetytest.service.BookService;
//import org.springframework.stereotype.Component;
//
//import java.util.Set;
//
//@Component
//public class BookQuery implements GraphQLQueryResolver {
//
//    private BookService bookService;
//
//    public BookQuery(BookService bookService) {
//        this.bookService = bookService;
//    }
//
//    public Set<Book> getBooksByAuthor(Author author) {
//        return bookService.getBooksByAuthor(author);
//    }
//
//    public Set<Book> getAllBooks() {
//        return bookService.getAllBooks();
//    }
//}
