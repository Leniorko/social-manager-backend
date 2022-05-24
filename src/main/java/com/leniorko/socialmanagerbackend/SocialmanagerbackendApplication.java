package com.leniorko.socialmanagerbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SocialmanagerbackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(SocialmanagerbackendApplication.class, args);
	}
	
	@GetMapping("/test")
	String testing() {
		return "THIS WORKING";
	}

}
