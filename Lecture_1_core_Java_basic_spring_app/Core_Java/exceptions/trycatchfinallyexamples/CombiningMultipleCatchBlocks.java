package com.gfg.exceptions.trycatchfinallyexamples;

public class CombiningMultipleCatchBlocks {

    public static void main(String args[]){
        try{
            int a[]=new int[7];
            a[4]=30/0;
            System.out.println("First print statement in try block");
        }
        catch(ArithmeticException | ArrayIndexOutOfBoundsException e){
            System.out.println("Warning: ArithmeticException");
        }

        System.out.println("Out of try-catch block...");
    }
}
