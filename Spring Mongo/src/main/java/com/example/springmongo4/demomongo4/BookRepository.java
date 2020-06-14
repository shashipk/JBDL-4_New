package com.example.springmongo4.demomongo4;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface BookRepository extends MongoRepository<Book, Integer> {

    public List<Book> findByAuthorName(String name);

}
