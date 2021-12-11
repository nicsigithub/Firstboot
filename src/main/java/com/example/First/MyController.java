package com.example.First;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
   @GetMapping("/hello")
	public String getValue() {
		
		return "Hello I am SHashank";
	}
	
	
}
