package com.shashi.App31;

import java.util.ArrayList;
import java.util.HashMap;

public class ArrayList1 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<String> list2= new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list2.add("Raju");

        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

        ArrayList<User> userList = new ArrayList<>();

        User user1 = new User(1,"Ramu",24);
        User user2 = new User(2,"Raju",26);

        user1.setAge(-2);

        userList.add(user1);
        userList.add(user2);
        Animal animal= new Animal();
        animal.setAge(-10);

        for(int i=0;i<userList.size();i++){
            System.out.println(userList.get(i).getName());
        }

        HashMap<Integer,Integer> wallet = new HashMap<>();
        wallet.put(1,10);// key(id) - value(balance)
        wallet.put(2,20);
        wallet.put(1,15);

        System.out.println(wallet.get(1));
        System.out.println(wallet.get(2));

 // OOPs
        // Inheritance : Reuse the code
        // Encapsulation:
        // 1. Data binding
        // 2. Data Hiding

        // Polymorphism:
        // static poly: method overloading
        // dynamic poly : method over-riding

        // Abstraction: abstract classes , interfaces
        // Implementation Hiding ( Hide Details)

        Adder adder = new Adder();
        adder.add(2,5);
        adder.add("abc","def");
    }
}

// REST APIs

class Adder{
    int add(int a, int b){
        return a+b;
    }

    int add(int a, int b, int c){
        return a+b+c;
    }

    String add(String a, String b){
        return a+b;
    }
}

class Car{
    float price;// 34.78

    public Integer getPrice() {
        return 34;
    }
}

class Animal{
    private int age;
    public String color;
    public int ht;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age>=0)
        this.age = age;
    }
    // getters
}

class Dog extends Animal{

}
