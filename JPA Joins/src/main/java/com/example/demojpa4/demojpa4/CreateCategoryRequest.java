package com.example.demojpa4.demojpa4;

import com.example.demojpa4.demojpa4.Models.Book;

import java.util.List;
import java.util.Set;

public class CreateCategoryRequest {

    private String bookCategoryName;
    private List<Book> books;

    public String getBookCategoryName() {
        return bookCategoryName;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}
