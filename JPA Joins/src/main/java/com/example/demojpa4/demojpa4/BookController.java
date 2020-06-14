package com.example.demojpa4.demojpa4;

import com.example.demojpa4.demojpa4.Models.Book;
import com.example.demojpa4.demojpa4.Models.BookCategory;
import com.example.demojpa4.demojpa4.Repository.BookCategoryRepository;
import com.example.demojpa4.demojpa4.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    BookCategoryRepository bookCategoryRepository;

    @Autowired
    BookRepository bookRepository;

    @PostMapping("/createCategorywithBooks")
    public void createCategoryWithBooks(@RequestBody CreateCategoryRequest request){
        bookCategoryRepository.save(new BookCategory(request.getBookCategoryName(), request.getBooks()));
    }

    @PostMapping("/createCategory")
    public void createCategory(@RequestBody CreateCategoryRequest request){
        bookCategoryRepository.save(new BookCategory(request.getBookCategoryName()));
    }

    @PostMapping("/createBooks")
    public void createBooks(@RequestBody CreateCategoryRequest request){
        bookRepository.saveAll(request.getBooks());
    }

    @GetMapping("/getBooks")
    public List<Book> getBooks(@RequestParam("name") String name, @RequestParam("authorName") String authorName){
        return bookRepository.getBooksByAuthorAndBookName(authorName, name);
    }
}
