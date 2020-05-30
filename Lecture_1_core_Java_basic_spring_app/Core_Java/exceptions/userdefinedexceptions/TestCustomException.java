package com.gfg.exceptions.userdefinedexceptions;

public class TestCustomException {
    public static void main(String[] args) {
        try {

            System.out.println("Start of try block");
            throw new MyCustomException("message");
        } catch (MyCustomException e) {
            System.out.println(e.getMessage());
        }
    }
}

