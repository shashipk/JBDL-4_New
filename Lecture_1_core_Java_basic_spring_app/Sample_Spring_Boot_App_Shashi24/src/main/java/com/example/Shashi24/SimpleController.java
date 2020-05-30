package com.example.Shashi24;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {

    @GetMapping("/hi")
    public String sayHi(){
        return "Hello from our server";
    }

    // http://localhost:8080/searh?q=Ramu&p=Shamu
    @GetMapping("/searh")
    public String searchAWord (@RequestParam String q) {
        DataStore db = new DataStore();
        return db.getFromDB(q);
    }
}
