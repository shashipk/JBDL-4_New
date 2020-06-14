package com.shashi.App31;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserService {
    HashMap<Integer,User> dataStore;
    public UserService(){
        dataStore = new HashMap<>();
        User user = new User();
        user.setAge(100);
        user.setId(1);
        user.setName("Ramu");
        dataStore.put(1,user);
    }
    public User findAUser(int id){
        return dataStore.get(id);
    }

    public User addAUser(User user){
        dataStore.put(user.getId(),user);
        return user;
    }
    public List<User> findAll(){
        ArrayList<User> list = new ArrayList<>();
        // using for-each loop for iteration over Map.entrySet()
        for (Map.Entry<Integer,User> entry : dataStore.entrySet()) {

            list.add(entry.getValue());
        }
        return list;

    }

}
