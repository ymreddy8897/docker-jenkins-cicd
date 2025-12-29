package com.comviva;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerJenkinCicdApplication {

	@GetMapping("/hello")
	public String hello() {
		return "Hello Spring Boot teaches by Javatechie !";
	}


	public static void main(String[] args) {
		SpringApplication.run(DockerJenkinCicdApplication.class, args);
	}

}
