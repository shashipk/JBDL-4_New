package com.example.jpabeans4.demojpabeans4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello2Controller {

    @Autowired
    HelloWorld helloWorld;

    @GetMapping("/func2")
    public void func2(){
        System.out.println(helloWorld);
    }
}
