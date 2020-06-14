package com.example.demojpa4.demojpa4.Repository;

import com.example.demojpa4.demojpa4.Models.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.concurrent.CompletionStage;

public interface BookRepository extends JpaRepository<Book, Integer> {

    @Query(value = "select * from book b where b.author_name=:my_name", nativeQuery = true)
    public List<Book> findByAuthor(String my_name);
//
//    @Query(value = "select b from Book b where b.authorName=:authors_name")
//    public List<Book> findByAuthors(String authors_name);

    // mongodb , couchdb, hbase, dynamodb, cassandra,
//    List<Book> findBycost(int cost);
//
//    List<Book> findByCost(int cost);
//
//    Book findById(int id);

    @Query(value = "select * from Book b where b.author_name = ?1 and b.name = ?2", nativeQuery = true)
    public List<Book> getBooksByAuthorAndBookName(String authorName, String bookName);


}
