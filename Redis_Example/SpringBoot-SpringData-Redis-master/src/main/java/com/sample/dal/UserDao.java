package com.sample.dal;

public interface UserDao {

    public Boolean saveUser(User user) ;
    public User findByName(String name) ;


}
