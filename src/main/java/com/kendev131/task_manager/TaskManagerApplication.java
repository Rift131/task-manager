package com.kendev131.task_manager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController // Allows Rest clients like Postman to test this application
public class TaskManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TaskManagerApplication.class, args);
	}
	@GetMapping // <- REST ENDPOINT
	public String helloWorld() {
		return "Hello World Spring Boot";
	}
}
