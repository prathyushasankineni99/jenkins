package com.example.demo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JenkinsApplication {
 
	@GetMapping("/ping")
	public String message() {
		return "Wao!! Application Deployed successfully in SAP Cloud..";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(JenkinsApplication.class, args);
	}

}
