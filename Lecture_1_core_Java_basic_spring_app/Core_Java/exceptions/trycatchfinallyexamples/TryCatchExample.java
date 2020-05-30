package com.gfg.exceptions.trycatchfinallyexamples;

public class TryCatchExample {

    public static int divide(int a,int b){
        return a/b;
    }

    public static void main(String[] args) {
        try{
            System.out.println(divide(25,0));
        }catch (ArithmeticException ex){
            System.out.println("Some issue with division");
        }
    }
}
