package com.chellaa.bookstore.repo;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.chellaa.bookstore.entity.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, Integer> {

	Book findById(int bookId);
	 
}


