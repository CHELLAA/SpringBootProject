package com.chellaa.bookstore.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chellaa.bookstore.entity.Book;
import com.chellaa.bookstore.repo.BookRepository;

@Service
public class BookService {
	
	@Autowired
	private BookRepository bookRepository;

	//get
	public List<Book> getBook(){
		
		List<Book> bookList= new ArrayList<>();
		bookRepository.findAll().forEach(book -> bookList.add(book));
		return bookList;
	}
	//create
	public Book createBook(Book book)
	{
	 return bookRepository.save(book);	
	}
	//single resource
	
	public Book getBookById(int bookId)
	{
		return bookRepository.findById(bookId);
	}
	public  Book updateBook(Book incomingBook) {
	//update
		
		return bookRepository.save(incomingBook);
	}
	//delete
	public String deleteById(int bookId)
	{
		bookRepository.deleteById(bookId);
		return "Deleted Successfully";
	}
}
