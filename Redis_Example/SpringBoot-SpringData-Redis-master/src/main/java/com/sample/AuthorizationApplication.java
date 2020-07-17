package com.sample;


import com.sample.dal.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.data.redis.repository.configuration.EnableRedisRepositories;

import java.util.ArrayList;
import java.util.HashMap;

@SpringBootApplication
@EnableRedisRepositories
@EnableCaching
public class AuthorizationApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuthorizationApplication.class, args);

		/*
		ArrayList<User> list = new ArrayList<User>();

		User user1 = new User();
		user1.setAge("10");

		list.add(user1);

		list.get(0); //

		HashMap<Integer,Integer> wallet = new HashMap<>();

		wallet.put(1,10);
		wallet.put(2,20);

		System.out.println(wallet.get(1));



		 */

	}





}

