package com.example.innosetytest.repository;

import com.example.innosetytest.Entity.Author;
import com.example.innosetytest.Entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.List;
import java.util.Set;

@EnableJpaRepositories
public interface BookRepository extends JpaRepository<Book, Integer> {
    Set<Book> getBookByAuthors(Author author);
    Book findByTitle(String title);
}
