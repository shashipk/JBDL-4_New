package com.sample.service;

import com.sample.dal.User;


public interface AuthorizationService {


    public Boolean saveUser(User user);

    public User findByName(String name);


}
