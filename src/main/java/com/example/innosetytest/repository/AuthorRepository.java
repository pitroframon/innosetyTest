package com.example.innosetytest.repository;

import com.example.innosetytest.Entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
public interface AuthorRepository extends JpaRepository<Author, Integer> {
    Author getAuthorByName(String name);
}
