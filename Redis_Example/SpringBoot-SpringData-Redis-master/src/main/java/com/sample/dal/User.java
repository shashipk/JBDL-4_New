package com.sample.dal;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.redis.core.RedisHash;

import java.io.Serializable;


@Data
@NoArgsConstructor
@RedisHash("User")
public class User implements Serializable{
    private Long id;

    private String name;
    private String surname;
    private String age;


    public User(Long id, String name, String surname, String age) {

        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;



    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

}
