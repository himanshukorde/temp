package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		int x = 100;
		int y = 200;
		int z = 300;
		SpringApplication.run(DemoApplication.class, args);
	}

}
