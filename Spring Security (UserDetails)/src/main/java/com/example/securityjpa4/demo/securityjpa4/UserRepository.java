package com.example.securityjpa4.demo.securityjpa4;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

    public User findByUserName(String name);
}
