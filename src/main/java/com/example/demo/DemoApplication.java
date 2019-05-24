package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.dao.BookRepository;
import com.example.demo.model.Book;

@SpringBootApplication
public class DemoApplication {
	 
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		
	}
	
	@Bean
    public CommandLineRunner run(BookRepository bookRepository) throws Exception {
        return (String[] args) -> {
            Book book1 = new Book((long) 1, "john@domain.com","Comics");
            Book book2 = new Book((long) 2, "julie@domain.com","Fiction");
            Book book3 = new Book((long) 3, "david@domain.com","Horror");
            bookRepository.save(book1);
            bookRepository.save(book2);
            bookRepository.save(book3);
            bookRepository.findAll().forEach(book -> System.out.println(book.getName() + " "+ book.getCategory()));
            bookRepository.findByCategory("Comics").forEach(book -> System.out.println(book.getName() + " "+ book.getCategory()));
        };
	
	}
}
