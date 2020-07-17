package com.example.demosecurity4.demosecurity4;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FooBarController {

    // This require authentication and authorization as well
    @GetMapping("/student")
    public String getStudent(){
        return "hello student";
    }

    // This require authentication and authorization as well
    @GetMapping("/admin")
    public String getAdmin(){
        return "hello admin";
    }

    // This api does not require authentication and authorization
    @GetMapping("/visitor")
    public String getVisitor(){
        return "hello visitor";
    }

}
