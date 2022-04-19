//package com.example.innosetytest.controllers;
//
//import com.example.innosetytest.Entity.Author;
//import com.example.innosetytest.service.AuthorService;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//@RestController("/authors")
//public class AuthorController {
//
//    private AuthorService authorService;
//
//    public AuthorController(AuthorService authorService) {
//        this.authorService = authorService;
//    }
//
//    @GetMapping("/{name}")
//    public ResponseEntity<Author> getAuthor(@PathVariable("name") String name){
//        if(authorService.getAuthorByName(name) == null){
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }
//        return new ResponseEntity<>(authorService.getAuthorByName(name), HttpStatus.OK);
//    }
//
//    @PostMapping("/")
//    public ResponseEntity<Author> saveAuthor(@RequestBody Author author){
//        return new ResponseEntity<>(authorService.saveAuthor(author.getName(), author.getBooks()), HttpStatus.ACCEPTED);
//    }
//}
