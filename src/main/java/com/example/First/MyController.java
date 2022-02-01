package com.example.First;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
   @GetMapping("/hello")
	public String getValue() {
		
		return "Hello I am SHashank";
	}
	
   @PostMapping("/hello1")
	public User createValue() {
		User u=new User();
        u.setName("shashank singhal");
        u.setPassword("12345");
        return u;
	}
}
