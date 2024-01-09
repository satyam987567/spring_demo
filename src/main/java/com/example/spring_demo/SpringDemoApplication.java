package com.example.spring_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringDemoApplication {

	public static void main(String[] args) {
//		Vihicle obj=new Bike();
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		Vihicle obj= (Vihicle)context.getBean("vehicle");
		obj.drive();
//		SpringApplication.run(SpringDemoApplication.class, args);
	}

}
