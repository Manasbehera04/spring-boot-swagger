package com.swagger.api.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.swagger.api.model.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {

}
