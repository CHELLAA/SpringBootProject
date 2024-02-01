package com.chellaa.bookstore.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.chellaa.bookstore.entity.Book;
import com.chellaa.bookstore.service.BookService;

@RestController

public class BookController {
	@Autowired
	private BookService bookService;
	
	@RequestMapping(value="/books")
	public List<Book> getBooks()
	{
		
		return bookService.getBook();
	}
	
	@RequestMapping(value="/savebooks",method=RequestMethod.POST)
	public Book createBook(@RequestBody Book book) {
		return bookService.createBook(book);
	}
	
	@RequestMapping(value="/books/{id}")
	public Book getBookById(@PathVariable("id") int bookId) {
		return bookService.getBookById(bookId);
	}
	
	@RequestMapping(value="/books",method=RequestMethod.PUT)
	public Book updateBook(@RequestBody Book incomingBook)
	{
		return bookService.updateBook(incomingBook);
		
	}
	@RequestMapping(value="/booksDelete/{bookId}",method = RequestMethod.DELETE)
	public String deleteBookById(@PathVariable int bookId) {
		return bookService.deleteById(bookId);
	}
}
