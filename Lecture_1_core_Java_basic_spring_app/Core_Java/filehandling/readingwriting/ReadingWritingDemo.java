package com.gfg.filehandling.readingwriting;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadingWritingDemo {

    public static void main(String[] args) {
        String sourceFile = "/Users/danchara/java-spring-boot-training/java-training/Lecture3/src/main/java/com/gfg/filehandling/source.txt";
        String targetFile = "/Users/danchara/java-spring-boot-training/java-training/Lecture3/src/main/java/com/gfg/filehandling/target.txt";

        try (FileReader fileReader = new FileReader(sourceFile);

             BufferedReader bufferedReader = new BufferedReader(fileReader);

             FileWriter fileWriter = new FileWriter(targetFile);
        ){

            while(true){
                String line = bufferedReader.readLine() ;

                if(line == null){
                    break;
                }
                System.out.println(line);
                fileWriter.write(line + "\n");

            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
