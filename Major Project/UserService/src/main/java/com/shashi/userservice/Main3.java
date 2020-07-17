package com.shashi.userservice;

import java.security.SecureRandom;

public class Main3 {

    String a = "abc";
    String b = "ggg";

    String c = Adder.add(a,b);



}
// Command pattern

class Faredata{
    String name ;

}

class TrainService{

    int calculatefare(Faredata faredata){
        return 0;

    }
}

class User{
    private int id;
    private int age;

    // Control to set the values
    public void setAge(int age) {
        if(age>=0)
        this.age = age;
    }
}

/*

dynamic poly : method overriding
static poly : method overloading
 */

// Service: Services : API (methods )
class Adder {

    public static int add(int a, int b) {
        return a + b;
    }

    public static String add(String a, String b) {
        return a + b;
    }

    public static int add(int a, int b, int c) {
        return a + b+ c;
    }

}

/*


 */




