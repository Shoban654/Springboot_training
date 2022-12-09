package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;

@SpringBootApplication
@Component
public class DemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext obj_getter =SpringApplication.run(DemoApplication.class, args);
		System.out.println("Hello there");
		Demo1 demo1_obj=obj_getter.getBean(Demo1.class);
		demo1_obj.printname();
		
	}

}
