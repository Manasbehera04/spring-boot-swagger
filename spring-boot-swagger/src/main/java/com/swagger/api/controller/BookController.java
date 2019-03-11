package com.swagger.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.swagger.api.model.Book;
import com.swagger.api.service.BookService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/book")
@Api(value = "Book service", description = "My Book Store")
public class BookController {
	@Autowired
	private BookService service;

	@PostMapping("/saveBook")
	@ApiOperation(value = "store book api") // This annotation is to give a meaningful name to the method
	public String saveBook(@RequestBody Book book) {
		return service.saveBook(book);
	}

	@ApiOperation(value = "search book api")
	@GetMapping("/searchBook/{bookId}")
	public Book getBook(@PathVariable int bookId) {
		return service.getBook(bookId);
	}

	@DeleteMapping("/deleteBook/{bookId}")
	@ApiOperation(value = "delete book api")
	public List<Book> deleteBook(@PathVariable int bookId) {
		return service.removeBook(bookId);
	}
}
