package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Book {

	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private String category;

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Book() {

	}

	public Book(Long id, String name) {
		this.id = id;
		this.name = name;
	}
	public Book(Long id, String name, String category) {
		this.id = id;
		this.name = name;
		this.category = category;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
