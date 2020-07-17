package com.example.demojpa4.demojpa4;

import com.example.demojpa4.demojpa4.Models.Book;
import com.example.demojpa4.demojpa4.Repository.BookRepository;
import org.hibernate.annotations.GeneratorType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    BookRepository bookRepository;

    @GetMapping("/getBookByAuthorName")
    public List<Book> getBooks(@RequestParam(value = "name") String name){
        return bookRepository.getBooksByAuthName(name);
    }

    @PostMapping("/createBook")
    public void createBook(@RequestBody Book book){
        bookRepository.save(book);
    }
}
