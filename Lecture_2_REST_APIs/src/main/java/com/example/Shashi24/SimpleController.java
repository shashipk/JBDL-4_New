package com.example.Shashi24;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.Nullable;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;

import java.security.PublicKey;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

@RestController
public class SimpleController {

    DBUser db = new DBUser();

    // @GetMapping =
    // Spring Boot 2.3 ->
    // Spring 5 -> Spring 3 (90%)
    // produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    //public UserModel getUser(@PathVariable String id)

    @RequestMapping(path = "/hi", method = RequestMethod.GET,
            consumes = "application/json", produces = "application/json")
    public String sayHi(){
        return "Hello from our server";
    }
// https://api.github.com/users/shashipk  --> path param

    // http://localhost:8080/searh?q=Ramu   --> query
    @GetMapping("/searh")
    public String searchAWord (@RequestParam String q) {
        DataStore db = new DataStore();
        return db.getFromDB(q);
    }

    // http://localhost:8080/users  -> Get
    @GetMapping("/users")
    public List<User> getAllUsers(){
        return db.getAllUsers();

    }
    // http://localhost:8080/users/{id} --> Get
    @GetMapping("/users/{id}")



    public ResponseEntity<User> getAUser(@PathVariable int id){
        User user1 =  db.getAUser(id);
        MultiValueMap<String, String> headers = new LinkedMultiValueMap<>();
        headers.put("server", Collections.singletonList("codeofShashi"));

        HttpStatus status = HttpStatus.CREATED;
        ResponseEntity<User> response =
                new ResponseEntity<User>(user1,headers,status);
        return response;

    }

    // http://localhost:8080/users?q=Ramu --> Get
    @GetMapping("/user")
    public User getAUser(@RequestParam String q){
        return db.getAUserByName(q);
    }

    // POST APIs
    @PostMapping("/users")
    @ResponseStatus(HttpStatus.BAD_GATEWAY)
    public boolean createUser(@RequestBody User user)
                              {
        return db.addUser(user);

    }
  ///users/{id}
    @DeleteMapping("/users/{id}")
    public boolean deleteAUser(@PathVariable int id){
        return db.deleteAUser(id);
    }
    // 4xx - Issue with
    // 2xx - fine
    // 5xx - Issue with server
    // 3xx -




}
