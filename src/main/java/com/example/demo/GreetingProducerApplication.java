package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GreetingProducerApplication {

	@Autowired
	GreetingService greetingService;

	public static void main(String[] args) {
		SpringApplication.run(GreetingProducerApplication.class, args);
	}

	@RequestMapping(method = RequestMethod.GET, value = "/greeting/{id}")
	public Greeting getAccount(@PathVariable String id) {
		return greetingService.getById(id);
	}
	
	@RequestMapping(value = "v")
	public String getVersion() {
		return System.getenv("VERSION");
	}
	
}
