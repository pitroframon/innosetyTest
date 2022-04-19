//package com.example.innosetytest.graphqlQueryAndMutation;
//
//import com.coxautodev.graphql.tools.GraphQLMutationResolver;
//import com.example.innosetytest.Entity.Author;
//import com.example.innosetytest.Entity.Book;
//import com.example.innosetytest.service.BookService;
//import org.springframework.stereotype.Component;
//
//import java.util.Set;
//
//@Component
//public class BookMutation implements GraphQLMutationResolver {
//
//    private BookService bookService;
//
//    public BookMutation(BookService bookService) {
//        this.bookService = bookService;
//    }
//
//    public Book saveBook(String title, Set<Author> authors){
//        return bookService.saveBook(title, authors);
//    }
//}
