package com.gfg.oop.polymorphism.runtime;

public class Dog extends Animal{

    public void animalSound(){
        System.out.println("Woof");
    }
    public static void main(String args[]){
        Animal obj = new Dog();

        //Note that , it is not the Type(which is Animal) rather the Object which determines what method would be called at Runtime
        obj.animalSound();
    }
}