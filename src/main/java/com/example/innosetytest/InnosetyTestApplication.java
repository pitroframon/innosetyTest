package com.example.innosetytest;

import com.example.innosetytest.Entity.Author;
import com.example.innosetytest.Entity.Book;
import com.example.innosetytest.service.AuthorService;
import com.example.innosetytest.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.Collections;

@SpringBootApplication
public class InnosetyTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(InnosetyTestApplication.class, args);
    }

}
