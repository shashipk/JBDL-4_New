package com.shashi.library.management.Util;


import com.shashi.library.management.DataAccessLayer.Book;

public class BookValidator {

    public boolean isValid(Book book){

        if(book.getTitle()=="" || book.getTitle()==null)
            return false;
        return true;
    }
}
