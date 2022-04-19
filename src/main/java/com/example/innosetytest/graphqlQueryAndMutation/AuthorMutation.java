//package com.example.innosetytest.graphqlQueryAndMutation;
//
//import com.coxautodev.graphql.tools.GraphQLMutationResolver;
//import com.example.innosetytest.Entity.Author;
//import com.example.innosetytest.Entity.Book;
//import com.example.innosetytest.service.AuthorService;
//import org.springframework.stereotype.Component;
//
//import java.util.Set;
//
//@Component
//public class AuthorMutation implements GraphQLMutationResolver {
//
//    private AuthorService authorService;
//
//    public AuthorMutation(AuthorService authorService) {
//        this.authorService = authorService;
//    }
//
//    public Author saveAuthor(String name, Set<Book> books){
//        return authorService.saveAuthor(name, books);
//    }
//
//}
//
