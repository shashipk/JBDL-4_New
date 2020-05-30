package com.gfg.exceptions.trycatchfinallyexamples;

public class FinallyWithReturnInTry {

    public static void main(String args[])
    {
        System.out.println(FinallyWithReturnInTry.myMethod());
    }
    public static int myMethod()
    {
        try {
            return 112;
        }
        finally {
            System.out.println("This is Finally block");
            System.out.println("Finally block ran even after return statement");
        }
    }
}
