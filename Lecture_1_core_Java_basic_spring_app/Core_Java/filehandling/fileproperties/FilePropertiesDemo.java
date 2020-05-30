package com.gfg.filehandling.fileproperties;

import java.io.File;

public class FilePropertiesDemo {

    public static void main(String[] args) {
        //accept file name or directory name through command line args
        String fileName ="com/gfg/filehandling/source.txt";

        //pass the filename or directory name to File object
        File f = new File(fileName);

        //apply File class methods on File object
        System.out.println("File name :"+f.getName());
        System.out.println("Path: "+f.getPath());
        System.out.println("Absolute path:" +f.getAbsolutePath());
        System.out.println("Parent:"+f.getParent());
        System.out.println("Exists :"+f.exists());
        if(f.exists())
        {
            System.out.println("Is writeable:"+f.canWrite());
            System.out.println("Is readable"+f.canRead());
            System.out.println("Is a directory:"+f.isDirectory());
            System.out.println("File Size in bytes "+f.length());
        }
    }
}
