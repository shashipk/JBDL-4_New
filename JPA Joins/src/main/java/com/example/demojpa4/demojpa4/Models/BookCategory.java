package com.example.demojpa4.demojpa4.Models;

import javax.persistence.*;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

@Entity
public class BookCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;

    @OneToMany(mappedBy = "bookCategory", cascade = CascadeType.ALL)
    private List<Book> books;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public BookCategory(String name) {
        this.name = name;
    }

    public BookCategory(String name, List<Book> books) {
        this.name = name;
        this.books = books;
        this.books.forEach(x -> x.setBookCategory(this));

//        Iterator it = books.iterator();
//        while(it.hasNext()){
//           Book book =  (Book)it.next();
//           book.setBookCategory(this);
//        }

    }

    public BookCategory() {
    }
}
