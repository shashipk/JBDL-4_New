package com.gfg.exceptions.trycatchfinallyexamples;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TryWithResourceExample {

    private static void printFile()  {

        try(FileInputStream input = new FileInputStream("/Users/danchara/java-spring-boot-training/java-training/Lecture3/src/main/java/com/gfg/exceptions/source.txt")) {

            int data = input.read();
            while(data != -1){
                System.out.print((char) data);
                data = input.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        printFile();
    }

}
