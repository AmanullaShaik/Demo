package com.example.demo.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, Long> {
	Optional<Book> findById(Long id);
	List<Book> findByCategory(String category);
}