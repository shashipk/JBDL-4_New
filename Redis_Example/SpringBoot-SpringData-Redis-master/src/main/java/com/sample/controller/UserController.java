package com.sample.controller;


import com.sample.dal.User;
import com.sample.service.AuthorizationService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    AuthorizationService authorizationService;

    // @PostMapping
    @RequestMapping(value = "/users", method = RequestMethod.POST)
    public ResponseEntity<String> addUser(@RequestBody User user) {

        /*
        ModelMapper modelMapper = new ModelMapper();
        User user = modelMapper.map(User, User.class);

         */
        Boolean result = authorizationService.saveUser(user);
        if (result) {
            return ResponseEntity.ok("A new user is saved!!!");
        } else {
            return ResponseEntity.ok("An error occured!!!");
        }

    }


    @RequestMapping(value = "/findUser", method = RequestMethod.POST)
    public ResponseEntity<User> findUser(@RequestBody User user) {

        /*
        ModelMapper modelMapper = new ModelMapper();
        User user = modelMapper.map(User, User.class);

         */
        User result = authorizationService.findByName(user.getName());

        return ResponseEntity.ok(result);


    }


    @Cacheable(value = "user", key = "#name")
    @GetMapping("/users/{name}")
    public User getAUser(@PathVariable("name") String name){

        return authorizationService.findByName(name);


    }
}

