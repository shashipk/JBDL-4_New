package com.example.demojpa4.demojpa4;

import com.example.demojpa4.demojpa4.Models.Book;
import com.example.demojpa4.demojpa4.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class DemoJpa4Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DemoJpa4Application.class, args);
	}

	@Autowired
	BookRepository bookRepository;

	@Override
	public void run(String... args) throws Exception {
//
//
//		List<Book> books = new ArrayList<>();
////
//		Book b3 = new Book("Python", "BOB", 200);
//		Book b2 = new Book("ABC", "Shashi", 40);
////
//		books.add(b3);
//		books.add(b2);
//
//		bookRepository.saveAll(books);
//		System.out.println(bookRepository.findByAuthorName("Shashi"));
//		System.out.println(bookRepository.findByAuthor("Shashi"));
//		System.out.println(bookRepository.findByAuthors("Abhay"));
//		System.out.println(bookRepository.findById(2));
//		System.out.println(bookRepository.findBy(40));
//		System.out.println(bookRepository.findByCOST(40));


	}
}
