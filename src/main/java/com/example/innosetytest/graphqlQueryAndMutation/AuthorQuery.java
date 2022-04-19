//package com.example.innosetytest.graphqlQueryAndMutation;
//
//import com.coxautodev.graphql.tools.GraphQLQueryResolver;
//import com.example.innosetytest.Entity.Author;
//import com.example.innosetytest.service.AuthorService;
//import org.springframework.stereotype.Component;
//
//@Component
//public class AuthorQuery implements GraphQLQueryResolver {
//
//    private AuthorService authorService;
//
//    public AuthorQuery(AuthorService authorService) {
//        this.authorService = authorService;
//    }
//
//    public Author getAuthor(String name){
//        if(authorService.getAuthorByName(name) == null){
//            return null;
//        }
//        return authorService.getAuthorByName(name);
//    }
//}
