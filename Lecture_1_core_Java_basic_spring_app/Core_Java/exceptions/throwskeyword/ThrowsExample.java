package com.gfg.exceptions.throwskeyword;

import java.io.IOException;

public class ThrowsExample {

    private static void myMethod(int num)throws IOException, ClassNotFoundException{
        if(num==1)
            throw new IOException("IOException Occurred");
        else
            throw new ClassNotFoundException("ClassNotFoundException");
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ThrowsExample throwsExample = new ThrowsExample();
        throwsExample.myMethod(5);
    }
}
