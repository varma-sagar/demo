package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
@RequestMapping("/")
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping
	public String index(){
		return "Hello Spring Boot";
	}

	@GetMapping("/Error/{id}")
	public String Error(@PathVariable String id){
		return "Error Page"+id;
	}

	@GetMapping("/hello/{id}")
	public String Hello(@PathVariable String id){
		return "Hll"+id;
	}

}
