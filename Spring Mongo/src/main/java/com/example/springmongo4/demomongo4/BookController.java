package com.example.springmongo4.demomongo4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class BookController {

    @Autowired
    BookRepository bookRepository;

    @GetMapping("/getBooks")
    public List<Book> getBook(){
        return bookRepository.findAll();
    }

    @PostMapping(value = "/insertBook")
    public void insertBook(@RequestBody CreateRequest request){

        Book book = new Book(request.getName(), request.getAuthorName(), request.getCost(), request.get_count());
        bookRepository.save(book);
    }

    @GetMapping("/getBookByAuthor/{name}")
    public List<Book> getBookByAuthorname(@PathVariable(value = "name") String name){
        return bookRepository.findByAuthorName(name);
    }

}
