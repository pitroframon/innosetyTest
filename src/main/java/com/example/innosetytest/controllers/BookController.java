//package com.example.innosetytest.controllers;
//
//import com.example.innosetytest.Entity.Author;
//import com.example.innosetytest.Entity.Book;
//import com.example.innosetytest.service.AuthorService;
//import com.example.innosetytest.service.BookService;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//import java.util.Set;
//
//@RestController("/books")
//public class BookController {
//
//    private BookService bookService;
//
//    public BookController(BookService bookService) {
//        this.bookService = bookService;
//    }
//
//    @GetMapping("/")
//    public ResponseEntity<Set<Book>> getBooksByAuthor(Author author){
//        return new ResponseEntity<>(bookService.getBooksByAuthor(author), HttpStatus.OK);
//    }
//
//    @GetMapping("/all")
//    public ResponseEntity<Set<Book>> getAllBooks(){
//        return new ResponseEntity<>(bookService.getAllBooks(), HttpStatus.OK);
//    }
//
//    @PostMapping("/")
//    public ResponseEntity<Book> saveBook(@RequestBody Book book){
//        return new ResponseEntity<>(bookService.saveBook(book.getTitle(), book.getAuthors()), HttpStatus.OK);
//    }
//}
