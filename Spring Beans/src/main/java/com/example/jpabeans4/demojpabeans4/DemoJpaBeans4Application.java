package com.example.jpabeans4.demojpabeans4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class DemoJpaBeans4Application {

	public static void main(String[] args) {
		SpringApplication.run(DemoJpaBeans4Application.class, args);

//		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
//
//		ctx.register(MyConfig.class);
//		ctx.refresh();
//
//		HelloWorld obj1 = ctx.getBean(HelloWorld.class);
////		HelloWorld obj2 = ctx.getBean(HelloWorld.class);
//
//		obj1.setMsg("This is an object");
//		obj1.setData("ABC");
//
//		System.out.println(obj1);
////		System.out.println(obj2);

	}

}
