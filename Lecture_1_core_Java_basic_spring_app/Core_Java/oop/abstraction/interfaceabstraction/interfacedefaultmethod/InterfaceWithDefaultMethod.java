package com.gfg.oop.abstraction.interfaceabstraction.interfacedefaultmethod;

public interface InterfaceWithDefaultMethod {
    int a = 10;
    default void display()
    {
        System.out.println("hello");
    }
}
