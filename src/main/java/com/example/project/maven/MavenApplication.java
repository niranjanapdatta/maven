package com.example.project.maven;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MavenApplication {

	public static void main(String[] args) {
		SpringApplication.run(MavenApplication.class, args);
	}
	
	@GetMapping("/")
	public String print() {
		return "Simple Maven Project";
	}

}
