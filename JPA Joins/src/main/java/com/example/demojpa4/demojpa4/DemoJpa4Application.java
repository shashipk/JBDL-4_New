package com.example.demojpa4.demojpa4;

import com.example.demojpa4.demojpa4.Models.Book;
import com.example.demojpa4.demojpa4.Models.BookCategory;
import com.example.demojpa4.demojpa4.Repository.BookCategoryRepository;
import com.example.demojpa4.demojpa4.Repository.BookRepository;
import jdk.internal.org.objectweb.asm.Handle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@SpringBootApplication
public class DemoJpa4Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DemoJpa4Application.class, args);
	}

	@Autowired
	BookRepository bookRepository;

	@Autowired
	BookCategoryRepository bookCategoryRepository;

	@Override
	public void run(String... args) throws Exception {


//		Set<Book> books = new HashSet<>();
////
////		Book b1 = new Book("HTML", "BOB", 200);
//		Book b2 = new Book("Jquery", "Louis", 240, 5);
////
////		books.add(b1);
//		books.add(b2);
//
//		bookRepository.save(b2);
//		bookRepository.save(b1);
//		bookRepository.saveAll(books);

//		bookRepository.saveAll(books);

//		bookCategoryRepository.save(new BookCategory("Non Programming Langs"));
//
//		bookCategoryRepository.save(new BookCategory("Programming langs", books));
//



//		System.out.println(bookRepository.findByAuthorName("Shashi"));
//		System.out.println(bookRepository.findByAuthor("Shashi"));
//		System.out.println(bookRepository.findByAuthors("Abhay"));
//		System.out.println(bookRepository.findById(2));
//		System.out.println(bookRepository.findBy(40));
//		System.out.println(bookRepository.findByCOST(40));


	}
}
