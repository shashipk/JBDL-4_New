package com.gfg.oop.inheritance.multilevel;

public class Child extends Parent{

    public void Print() {
        //super.super.Print();  // Trying to access Grandparent's Print() which isn't possible in JAVA

        //TODO : Uncomment below to run
        //super.Print();
        System.out.println("Child's Print()");
    }
}
