package com.shashi.App31;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.List;

@RestController
public class Controller {
    UserService service = new UserService();


    RestTemplate restTemplate = new RestTemplate();
    // RestTemplate restTemplate = new RestTemplate();

    @GetMapping("/hi")
    public String sayHello(){
        return "Hello";
    }

    @GetMapping("/getInr")
    public String convertUSDToINR(@RequestParam("q") String q){
        Integer a = Integer.parseInt(q);
        a  = a* 75;
        return a.toString();
    }
// Paytm - (1, 10) ---- (2,20)
    // paytm.com/balance/1 --- 10
    @GetMapping("/balance/{id}")
    public Integer getBalance(@PathVariable("id") String id){
        System.out.println(id);

        HashMap<Integer,Integer> dataStore = new HashMap<>();
        dataStore.put(1,10);
        dataStore.put(2,20);

        return dataStore.get(Integer.parseInt(id));
    }

    @GetMapping("/users/{id}")
    public User getAUser(@PathVariable("id") Integer id){

        return service.findAUser(id);
    }

    @GetMapping("/users")
    public List<User> getAUser(){

        return service.findAll();
    }

    @PostMapping("/users")
    public User createUser(@RequestBody User user){
       // System.out.println("hi");
        // JVM - > Windows - > System calls
        return service.addAUser(user);

    }

//@GetMapping("/users/{id}")
    @DeleteMapping("/users/{id}")
    public boolean deleteAUser(@PathVariable("id") Integer id){
        return true;
    }

    @RequestMapping("/gitHub/users/{login}")
    public ResponseEntity<GitHubUser> get(@PathVariable("login") String login){

        ResponseEntity<GitHubUser> response = restTemplate.getForEntity(String.format("https://api.github.com/users/%s", login), GitHubUser.class);
        System.out.println(response.getHeaders());
        System.out.println(response.getStatusCode());
        GitHubUser gitHubUser = response.getBody();
        System.out.println(gitHubUser.toString());
        return response;
    }

}
