package com.gfg.exceptions.userdefinedexceptions;

public class MyCustomException extends Exception {

    public MyCustomException() {
        //System.out.println("My Custom Exception thrown");
    }

    public MyCustomException(String message) {
        super(message);

    }
}
