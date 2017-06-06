package com.example.demo;

import org.springframework.stereotype.Service;
import com.example.demo.Greeting;

@Service
public class GreetingService {
	public Greeting getById(String id) {
		return new Greeting(id, "Hi Kaburagi","Takayuki");
	}
}
