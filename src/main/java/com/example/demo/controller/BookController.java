package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Book;
import com.example.demo.service.BookService;

@RequestMapping("/api/books")
@RestController
public class BookController {

	@Autowired
	private BookService bookService;

	@RequestMapping(value = "", method = RequestMethod.GET)
	public List<Book> getBooks() {
		List<Book> books = bookService.list();
		for (Book book : books) {
			System.out.println(book.getName());
		}
		return books;
	}
}
